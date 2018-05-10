package com.example.nytnews.di.component;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

import com.example.nytnews.di.module.NetModule;
import com.example.nytnews.di.module.module.AppModule;

/**
 * Created by asadullah on 4/24/18.
 */
@Singleton
@Component(modules = {AppModule.class,NetModule.class} )
public interface NetComponent {

    Retrofit retrofit();
}
