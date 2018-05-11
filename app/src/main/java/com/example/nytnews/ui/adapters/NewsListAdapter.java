package com.example.nytnews.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nytnews.R;
import com.example.nytnews.model.NewsData;

/**
 * Created by asadullah on 3/5/18.
 */

public class NewsListAdapter extends RecyclerView.Adapter<NewsListAdapter.NewsViewHolder> {

    private NewsData newsPosts;

    public NewsListAdapter(NewsData newsPosts) {
        this.newsPosts = newsPosts;

    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater.from(parent.getContext()).inflate(R.layout.row_news,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {

        holder.newsText.setText(newsPosts.getResults().get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return newsPosts.getResults().size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {

         private TextView newsText;

        public NewsViewHolder(View itemView) {
            super(itemView);
            newsText = itemView.findViewById(R.id.newheading_text);
        }

    }
}
