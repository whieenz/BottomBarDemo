package com.example.administrator.bottombardemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recyclerView;
    private List<String> mData;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniDatas();

        iniView();
        adapter = new MyAdapter(this,mData);
        recyclerView.setAdapter(adapter);
        //设置recycleView 的布局管理
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        //设置recycleView item之间的分割线

        recyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this).build());

    }

    private void iniView() {
        recyclerView = (RecyclerView) findViewById(R.id.id_recycleview);
    }

    private void iniDatas() {
        mData = new ArrayList<String>();
        for (int i = 'A'; i < 'z'; i++) {
            mData.add(""+(char)i);
        }
    }

    public void test(View view){
        Toast.makeText(this,"扫一扫！",Toast.LENGTH_LONG).show();
    }
}
