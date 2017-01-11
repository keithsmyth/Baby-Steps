package com.keithsmyth.babysteps;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;
import com.keithsmyth.babysteps.model.UserManager;

public class Injector {

    private final Application application;

    private UserManager userManager;

    public Injector(Application application) {
        this.application = application;
    }

    public UserManager userManager() {
        if (userManager == null) {
            synchronized (this) {
                if (userManager == null) userManager = new UserManager(application);
            }
        }
        return userManager;
    }

    public FirebaseAuth firebaseAuth() {
        return FirebaseAuth.getInstance();
    }
}
