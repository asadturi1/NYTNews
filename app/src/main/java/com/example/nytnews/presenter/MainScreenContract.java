package com.example.nytnews.presenter;

import com.example.nytnews.model.NewsData;

/**
 * Created by asadullah on 4/29/18.
 */

public interface MainScreenContract {
    interface View {
        void showPosts(NewsData posts);

        void showError(String message);

        void showComplete();
    }

    interface Presenter {
        void loadPost();
        void onDestroy();
    }
}
