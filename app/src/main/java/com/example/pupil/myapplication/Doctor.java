package com.example.pupil.myapplication;

import android.util.Log;

import timber.log.Timber;

public class Doctor implements DoctorInterface,PupilInterface {
    @Override
    public void health() {
        Timber.d("Я могу лечить.");
        Log.d("","Я могу лечить.");

        }

        @Override
        public void analize(){
        Timber.d("Я могу анализировать.");
        Log.d("","Я могу анализировать.");
    }

    @Override
    public void write() {

    }

    @Override
    public void read() {

    }
}
