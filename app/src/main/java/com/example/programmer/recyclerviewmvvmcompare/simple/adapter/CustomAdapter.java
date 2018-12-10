package com.example.programmer.recyclerviewmvvmcompare.simple.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.programmer.recyclerviewmvvmcompare.R;
import com.example.programmer.recyclerviewmvvmcompare.simple.model.News;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.List;
import java.util.TimerTask;

/**
 * Created by Kamil on 2018-12-10.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    List<News> newsList;

    public CustomAdapter(List<News> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int i) {
        News news = newsList.get(i);
        holder.tvTitle.setText(news.getTitle());
        holder.tvDesc.setText(news.getDesc());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        TextView tvDesc;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvDesc = itemView.findViewById(R.id.tvDesc);
        }
    }
}
