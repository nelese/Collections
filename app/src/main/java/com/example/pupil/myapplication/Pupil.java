package com.example.pupil.myapplication;

import android.util.Log;

import timber.log.Timber;

public class Pupil extends Human implements PupilInterface {



    @Override
    public void run() {
        super.run();
        Timber.i("И мне это нравится.");
        Log.d("","И мне это нравится.");
    }

    @Override
    public void eat() {
        super.eat();
        Timber.i("И мне это нравится.");
        Log.d("","И мне это нравится.");
    }

    @Override
    public void write() {
        Timber.i("Я могу писать.");
        Log.d("","Я могу писать.");
    }

    @Override
    public void read() {
        Timber.i("Я могу читать.");
        Log.d("","Я могу читать.");
    }

    public Pupil() {

    }

    public Pupil(String name,String surname) {
        this.setName(name);
        this.setSurname(surname);
    }




}
