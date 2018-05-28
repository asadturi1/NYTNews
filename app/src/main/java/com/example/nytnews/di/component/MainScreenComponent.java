package com.example.nytnews.di.component;

import com.example.nytnews.di.module.ApiClientModule;
import com.example.nytnews.di.scope.CustomScope;
import com.example.nytnews.di.module.MainScreenModule;
import com.example.nytnews.presenter.MainScreenPresenter;
import com.example.nytnews.ui.activities.MainActivity;

import dagger.Component;

/**
 * Created by asadullah on 4/30/18.
 */

    @CustomScope
    @Component(modules = {MainScreenModule.class,ApiClientModule.class})
    public interface MainScreenComponent {
        void injectMainActivity(MainActivity activity);
        MainScreenPresenter getPresenter();
    }

