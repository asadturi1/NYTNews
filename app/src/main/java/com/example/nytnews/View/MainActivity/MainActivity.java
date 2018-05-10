package com.example.nytnews.View.MainActivity;

import android.os.Bundle;
import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import com.example.nytnews.App;
import com.example.nytnews.DaggerMainScreenComponent;
import com.example.nytnews.MainScreenContract;
import com.example.nytnews.MainScreenModule;
import com.example.nytnews.MainScreenPresenter;
import com.example.nytnews.NewsListAdapter;
import com.example.nytnews.R;
import com.example.nytnews.model.NewsData;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View {

    private RecyclerView recyclerViewNews;
    private FloatingActionButton fab;
    private NewsListAdapter newsAdapter;
    private Toolbar toolbar;
    @Inject
    MainScreenPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        setSupportActionBar(toolbar);
        mainPresenter.loadPost();

        DaggerMainScreenComponent.builder()
                .netComponent(((App) getApplicationContext()).getNetComponent())
                .mainScreenModule(new MainScreenModule(this))
                .build().inject(this);


    }

    private void bindViews() {
        recyclerViewNews =  findViewById(R.id.listofnews_recyclerview);
        toolbar = findViewById(R.id.toolbar);
    }


    @Override
    public void showPosts(NewsData posts) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showComplete() {

    }
}
