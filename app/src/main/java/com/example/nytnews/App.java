package com.example.nytnews;

import android.app.Application;

import com.example.nytnews.di.component.DaggerNetComponent;
import com.example.nytnews.di.component.NetComponent;
import com.example.nytnews.di.module.NetModule;
import com.example.nytnews.di.module.module.AppModule;

import dagger.internal.DaggerCollections;

/**
 * Created by asadullah on 4/24/18.
 */

public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mNetComponent = DaggerNetComponent.builder().appModule(new AppModule(this))
                .netModule(new NetModule("https://api.nytimes.com/"))
                .build();

    }

    public NetComponent getNetComponent(){
        return this.mNetComponent;
    }
}
