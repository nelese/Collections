package com.example.pupil.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pupil.myapplication.папка.MyAdapter;

import java.util.ArrayList;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    Button btnClose;
    Button createPupil;
    ArrayList<Pupil> arr;
    RecyclerView list;
    EditText edName;
    EditText edSurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arr = new ArrayList<>();
        final TextView name = findViewById(R.id.name);
        final TextView surname = findViewById(R.id.surname);

        btnClose = findViewById(R.id.btnClose);
        list = findViewById(R.id.list);
        edName = findViewById(R.id.edName);
        edSurname = findViewById(R.id.edSurname);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        createPupil = findViewById(R.id.createPupil);
        createPupil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Pupil pupil = createPupil(edName.getText().toString(),edSurname.getText().toString());
                arr.add(pupil);
                name.setText(pupil.getName());
                surname.setText(pupil.getSurname());
                list.setLayoutManager(new LinearLayoutManager(getBaseContext()));
                list.setAdapter(new MyAdapter(arr));
                list.getAdapter().notifyDataSetChanged();
            }
        });

    }

    public Pupil createPupil(String name, String surname) {

        Pupil p = new Pupil(name, surname);
        return p;
    }


}
