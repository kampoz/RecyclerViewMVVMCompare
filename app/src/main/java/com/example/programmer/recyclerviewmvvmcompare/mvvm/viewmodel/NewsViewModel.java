package com.example.programmer.recyclerviewmvvmcompare.mvvm.viewmodel;

import com.example.programmer.recyclerviewmvvmcompare.mvvm.model.News;

/**
 * Created by Kamil on 2018-12-10.
 */
public class NewsViewModel {
    public String title;
    public String desc;

    public NewsViewModel() {
    }

    public NewsViewModel(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public NewsViewModel(News news) {
        this.title = news.title;
        this.desc = news.desc;

    }
}
