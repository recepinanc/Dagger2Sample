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
     * @param user
     * @return user's name's validity
     */
    public boolean login(User user) {
        return (user.getUsername() != null && user.getUsername().length() > 0);
    }

}
