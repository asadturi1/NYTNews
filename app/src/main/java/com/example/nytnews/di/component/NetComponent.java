package com.example.nytnews.di.component;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

import com.example.nytnews.di.module.ApiClientModule;

/**
 * Created by asadullah on 4/24/18.
 */
@Singleton
@Component(modules = {ApiClientModule.class} )
public interface NetComponent {

    Retrofit retrofit();
}
