package com.example.nytnews.presenter;

import com.example.nytnews.data.RestInterface;
import com.example.nytnews.model.NewsData;

import javax.inject.Inject;

import retrofit2.Retrofit;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by asadullah on 4/30/18.
 */

public class MainScreenPresenter implements MainScreenContract.Presenter {
    Retrofit retrofit;
    MainScreenContract.View view;
    Observer<NewsData> listOfNews;

    @Inject
    public MainScreenPresenter(Retrofit retrofit, MainScreenContract.View view) {
        this.retrofit = retrofit;
        this.view = view;
    }

    @Override
    public void loadPost() {

        listOfNews = getListOfNwes();

        retrofit.create(RestInterface.class).getPostList("e883d5deffce4a588ec97a25ab928467").
                subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(listOfNews);
    }

    @Override
    public void onDestroy() {

    }

    private Observer<NewsData> getListOfNwes(){

        return new Observer<NewsData>() {
            @Override
            public void onCompleted() {
                view.showComplete();
            }

            @Override
            public void onError(Throwable e) {
                view.showError(e.getMessage());
            }

            @Override
            public void onNext(NewsData posts) {
                view.showPosts(posts);
            }
        };

    }
}
