package com.example.nytnews.di.module;

import com.example.nytnews.data.Constants;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by asadullah on 5/21/18.
 */
@Module(includes = NetModule.class)
public class ApiClientModule {


    public ApiClientModule(){
    }

    @Provides
    public Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(Constants.baseUrl)
                .client(okHttpClient)
                .build();
    }
}
