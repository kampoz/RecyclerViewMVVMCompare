package com.example.programmer.recyclerviewmvvmcompare.mvvm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.programmer.recyclerviewmvvmcompare.R;
import com.example.programmer.recyclerviewmvvmcompare.mvvm.adapter.CustomAdapter;
import com.example.programmer.recyclerviewmvvmcompare.mvvm.viewmodel.NewsViewModel;


import java.util.ArrayList;
import java.util.List;

public class MVVMMainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;
    private List<NewsViewModel> newsList;

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
        newsList.add(new NewsViewModel("MVVM Title 1", "fsdfsfd"));
        newsList.add(new NewsViewModel("MVVM Title 2", "d fffdf fs dfsd dfs"));
        newsList.add(new NewsViewModel("MVVM Title 3", "dff fdffs dfsd dfs"));
        newsList.add(new NewsViewModel("MVVM Title 4", "dfff dffd dds dfsd dfs"));
    }
}
