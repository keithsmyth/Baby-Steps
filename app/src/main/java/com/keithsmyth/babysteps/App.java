package com.keithsmyth.babysteps;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    private Injector injector;

    @Override
    public void onCreate() {
        super.onCreate();
        injector = new Injector(this);
    }

    public static Injector inject(Context context) {
        return ((App)context.getApplicationContext()).injector;
    }
}
