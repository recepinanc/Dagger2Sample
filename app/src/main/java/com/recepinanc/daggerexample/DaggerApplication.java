package com.recepinanc.daggerexample;

import android.app.Application;

/**
 * Created by recepinanc on 22/08/16.with <3
 */
public class DaggerApplication extends Application {

    private LoginComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        // Don't forget to make 'Rebuild Project' before you call Dagger%your component's name%
        // We want the component to be available from the very beginning of our app so we do the
        // instantiation here.

    }

    public LoginComponent getComponent() {
        return component;
    }
}
