package com.example.nytnews;

import com.example.nytnews.View.MainActivity.MainActivity;
import com.example.nytnews.di.component.NetComponent;

import dagger.Component;

/**
 * Created by asadullah on 4/30/18.
 */

    @CustomScope
    @Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
    public interface MainScreenComponent {
        void inject(MainActivity activity);
    }

