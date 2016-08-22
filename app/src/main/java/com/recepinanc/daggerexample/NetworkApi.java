package com.recepinanc.daggerexample;

/**
 * Fake api class
 * <p/>
 * Created by recepinanc on 22/08/16.with <3
 */
public class NetworkApi {

    /**
     * Validates the username's existence
     *
     * @param username is a string entered by the user
     * @return its validity
     */
    public boolean login(String username) {
        return (username != null && username.length() > 0);
    }

}
