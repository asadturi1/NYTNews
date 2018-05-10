package com.example.nytnews.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.nytnews.model.NewsData;

/**
 * Created by asadullah on 3/5/18.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsViewHolder> {

    private Context context;
    private NewsData newsPosts;

    public NewsListAdapter(Context context, NewsData newsPosts) {
        this.context = context;
        this.newsPosts = newsPosts;

    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return newsPosts.getResults().size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        public NewsViewHolder(View itemView) {
            super(itemView);
        }

    }
}
