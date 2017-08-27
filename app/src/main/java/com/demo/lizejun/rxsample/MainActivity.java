package com.demo.lizejun.rxsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_main);
        List<String> titles = new ArrayList<>();
        titles.add("chapter1 background work");
        MainAdapter mainAdapter = new MainAdapter(titles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mainAdapter);
    }
}
