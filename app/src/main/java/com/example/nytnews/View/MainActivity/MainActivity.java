package com.example.nytnews.View.MainActivity;

import android.os.Bundle;
import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

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


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void bindViews() {
        //recyclerViewNews = ((RecyclerView) findViewById(R.id.));
        fab = findViewById(R.id.fab);
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
