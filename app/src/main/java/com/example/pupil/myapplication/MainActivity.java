package com.example.pupil.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    Button btnClose;
    Button createPupil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView name = findViewById(R.id.name);
        final TextView surname = findViewById(R.id.surname);

        btnClose = findViewById(R.id.btnClose);
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
                Pupil pupil = createPupil("Vasya","Pupkin");
                name.setText(pupil.getName());
                surname.setText(pupil.getSurname());
            }
        });

    }
    public Pupil createPupil(String name,String surname){

        Pupil p = new Pupil(name,surname);
        return p;
    }


}
