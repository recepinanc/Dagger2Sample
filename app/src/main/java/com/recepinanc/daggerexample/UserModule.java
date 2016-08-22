package com.recepinanc.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by recepinanc on 22/08/16.with <3
 */
@Module
public class UserModule {

    @Provides
    @Singleton
    User provideUser() {
        return new User("recepinanc");
    }
}