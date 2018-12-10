package com.example.programmer.recyclerviewmvvmcompare.mvvm.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.programmer.recyclerviewmvvmcompare.R;
import com.example.programmer.recyclerviewmvvmcompare.databinding.NewsBinding;
import com.example.programmer.recyclerviewmvvmcompare.mvvm.model.News;
import com.example.programmer.recyclerviewmvvmcompare.mvvm.viewmodel.NewsViewModel;

import java.util.List;

/**
 * Created by Kamil on 2018-12-10.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    List<NewsViewModel> newsList;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<NewsViewModel> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }

        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater, viewGroup, false);
        return new CustomViewHolder(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int i) {
        NewsViewModel newsViewModel = newsList.get(i);
        holder.bind(newsViewModel);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        private NewsBinding newsBinding;

        public CustomViewHolder(NewsBinding newsBinding) {
            super(newsBinding.getRoot());
            this.newsBinding = newsBinding;
        }

        public void bind(NewsViewModel newsViewModel) {
            this.newsBinding.setNewsViewModel(newsViewModel);
        }

        public NewsBinding getNewsBinding() {
            return newsBinding;
        }
    }
}
