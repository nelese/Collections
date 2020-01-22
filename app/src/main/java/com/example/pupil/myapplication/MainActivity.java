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
import java.util.Arrays;
import java.util.HashMap;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Cat> cats;
    private HashMap<Integer,Cat> map;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cats = catArrayList();
        map = catHashMap();
    }

    private ArrayList<Cat> catArrayList(){
      ArrayList cats = new ArrayList();
      for (int i=0; i<10; i++){
          cats.add(new Cat("Simon", (int) (Math.random()*10)));
      }
      return cats;
    }

    private HashMap<Integer, Cat> catHashMap(){
        HashMap map1 = new HashMap();
        for (int i=0; i<10; i++){
            map1.put(i,new Cat("Simon", (int) (Math.random()*10)));
        }
        return map1;
    }

}



