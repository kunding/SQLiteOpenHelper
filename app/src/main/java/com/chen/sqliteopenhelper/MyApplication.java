package com.chen.sqliteopenhelper;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by lsx on 2016/7/26.
 */
public class MyApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
