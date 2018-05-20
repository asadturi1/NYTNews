package com.example.nytnews.di.component;

import com.example.nytnews.di.module.ApiClientModule;
import com.example.nytnews.di.scope.CustomScope;
import com.example.nytnews.di.module.MainScreenModule;
import com.example.nytnews.ui.activities.MainActivity;

import dagger.Component;

/**
 * Created by asadullah on 4/30/18.
 */

    @CustomScope
    @Component(dependencies = ApiClientModule.class, modules = MainScreenModule.class)
    public interface MainScreenComponent {
        void inject(MainActivity activity);
    }

