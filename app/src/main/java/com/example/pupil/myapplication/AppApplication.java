package com.example.pupil.myapplication;

import android.app.Application;
import android.util.Log;

import timber.log.Timber;

public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        Log.d("","");
    }
}
