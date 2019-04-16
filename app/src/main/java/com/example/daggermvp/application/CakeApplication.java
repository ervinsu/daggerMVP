package com.example.daggermvp.application;

import android.app.Application;

public class CakeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initializeApplicationComponent();
    }

    private void initializeApplicationComponent() {

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
