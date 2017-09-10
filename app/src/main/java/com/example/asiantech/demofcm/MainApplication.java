package com.example.asiantech.demofcm;

import android.app.Application;

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 10/09/2017.
 * MainApplication main application.
 */
public class MainApplication extends Application {

    public static MainApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    /**
     * getInstance this method getInstance Application
     *
     * @return MainApplication
     */
    public static synchronized MainApplication getInstance() {
        return sInstance;
    }
}
