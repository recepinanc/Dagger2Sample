package com.recepinanc.daggerexample;

import javax.inject.Inject;

/**
 * Basic User model with only a name
 * <p/>
 * Created by recepinanc on 22/08/16.with <3
 */
public class User {

    private String username;

    @Inject
    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
