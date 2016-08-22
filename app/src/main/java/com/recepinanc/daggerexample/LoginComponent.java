package com.recepinanc.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by recepinanc on 22/08/16.with <3
 */

@Singleton
@Component(modules = {UserModule.class, NetworkApiModule.class})
public interface LoginComponent {
    void inject(MainActivity activity);
}
