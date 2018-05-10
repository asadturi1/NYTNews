package com.example.nytnews;

import com.example.nytnews.di.component.NetComponent;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * Created by asadullah on 4/30/18.
 */

@Module
public class MainScreenModule {

    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
