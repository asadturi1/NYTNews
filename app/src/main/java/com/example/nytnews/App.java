package com.example.nytnews;

import android.app.Application;


import com.example.nytnews.di.component.DaggerNetComponent;
import com.example.nytnews.di.component.MainScreenComponent;
import com.example.nytnews.di.component.NetComponent;
import com.example.nytnews.di.module.ContextModule;


import retrofit2.Retrofit;


/**
 * Created by asadullah on 4/24/18.
 */

public class App extends Application {

    private NetComponent netComponent;
    private MainScreenComponent viewComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent =  DaggerNetComponent.builder().contextModule(new ContextModule(this)).build();
      //  viewComponent =

    }

    public Retrofit getNetComponent(){
        return netComponent.retrofit();
    }
}
