package com.example.nytnews.di.module;

import android.content.Context;

import dagger.Provides;

/**
 * Created by asadullah on 5/21/18.
 */

public class ContextModule {

    Context context;

    public ContextModule(Context context){
        this.context=context;
    }

    @Provides
    public Context getContext(){
        return context;
    }

}
