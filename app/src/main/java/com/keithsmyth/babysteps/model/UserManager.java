package com.keithsmyth.babysteps.model;

import android.content.Context;
import android.content.SharedPreferences;

public class UserManager {

    private static final String PREFS = "BabyStepsPrefs";
    private final SharedPreferences prefs;

    public UserManager(Context context) {
        prefs = context.getApplicationContext().getSharedPreferences(PREFS, 0);
    }
}
