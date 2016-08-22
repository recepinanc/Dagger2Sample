package com.recepinanc.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by recepinanc on 22/08/16.with <3
 */
@Module
public class NetworkApiModule {

    @Provides
    @Singleton
    NetworkApi provideNetworkApi() {
        return new NetworkApi();
    }

}
