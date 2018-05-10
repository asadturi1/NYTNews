package com.example.nytnews.data;

import com.example.nytnews.model.NewsData;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by asadullah on 4/29/18.
 */

public interface RestInterface {
        @GET("/svc/topstories/v2/world.json")
        Observable<NewsData> getPostList(@Query("api-key") String apiKey);

}
