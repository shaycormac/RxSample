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
        titles.add("(1) 后台执行耗时操作，实时通知 UI 更新");
        titles.add("(2) 计算一段时间内数据的平均值");
        titles.add("(3) 搜索优化");
        titles.add("(4) 使用 Retrofit 加载数据");
        titles.add("(5) 简单及进阶的轮询操作");
        titles.add("(6) 基于错误类型的重试操作");
        titles.add("(7) 基于 combineLatest 实现的输入验证监听");
        titles.add("(8) 如何实现带有缓存的网络请求");
        MainAdapter mainAdapter = new MainAdapter(titles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mainAdapter);
    }
}
