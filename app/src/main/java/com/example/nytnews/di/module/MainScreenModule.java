package com.example.nytnews.di.module;

import com.example.nytnews.di.scope.CustomScope;
import com.example.nytnews.presenter.MainScreenContract;
import com.example.nytnews.presenter.MainScreenPresenter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by asadullah on 4/30/18.
 */

@Module(includes = ApiClientModule.class)
public class MainScreenModule {

    public final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @CustomScope
    @Provides
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }

    @CustomScope
    @Provides
    public MainScreenPresenter providePresenter(MainScreenContract.View view, Retrofit retrofit) {
        return new MainScreenPresenter(retrofit,view);
    }

}
