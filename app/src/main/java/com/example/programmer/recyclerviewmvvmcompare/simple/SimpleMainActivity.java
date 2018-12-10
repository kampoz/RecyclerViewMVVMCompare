package com.example.programmer.recyclerviewmvvmcompare.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.programmer.recyclerviewmvvmcompare.R;
import com.example.programmer.recyclerviewmvvmcompare.simple.adapter.CustomAdapter;
import com.example.programmer.recyclerviewmvvmcompare.simple.model.News;

import java.util.ArrayList;
import java.util.List;

public class SimpleMainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;
    private List<News> newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        newsList = new ArrayList<>();
        customAdapter = new CustomAdapter(newsList);
        recyclerView.setAdapter(customAdapter);
        setData();
    }

    private void setData() {
        newsList.add(new News("Title 1", "Desc 1"));
        newsList.add(new News("Title 2", "Desc 2"));
        newsList.add(new News("Title 3", "Desc 3"));
    }
}
