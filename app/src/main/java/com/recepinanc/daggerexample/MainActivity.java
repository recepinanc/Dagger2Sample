package com.recepinanc.daggerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    // Tell Dagger that we need it to inject user, it'll look to the @Module classes for the
    // @Provides Methods with the return type User and for the type NetworkApi
    // The user with the predefined username ('recepinanc')
    @Inject
    User user;
    @Inject
    NetworkApi networkApi;

    private EditText usernameET;
    private Button loginBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Allow to injection
        ((DaggerApplication) getApplication()).getComponent().inject(this);

        // If user has a valid name than it will write it to the text field.
        if (networkApi.login(user)) {
            usernameET.setText(user.getUsername());
        }
    }
}