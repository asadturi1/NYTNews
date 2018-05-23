package com.example.nytnews.di.module;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by asadullah on 3/27/18.
 */
@Module
public class AppModule {
    public Application application;

    public AppModule(Application application){
        this.application = application;
    }

    @Provides
    public Application getApplication(){
        return application;
    }
}
