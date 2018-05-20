package com.example.nytnews;

import android.app.Application;

import com.example.nytnews.data.Constants;

import com.example.nytnews.di.component.NetComponent;
import com.example.nytnews.di.module.ApiClientModule;
import com.example.nytnews.di.module.ContextModule;

import dagger.internal.DaggerCollections;

/**
 * Created by asadullah on 4/24/18.
 */

public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder().appModule(new ContextModule(this))
                .netModule(new ApiClientModule(Constants.baseUrl))
                .build();

    }

    public NetComponent getNetComponent(){
        return this.mNetComponent;
    }
}
