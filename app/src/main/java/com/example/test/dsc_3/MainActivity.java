package com.example.test.dsc_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DataAdapter adapter;

    ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvRec);
        loadData();

        adapter = new DataAdapter(data,this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void loadData()
    {
        data.add("DSC 1");
        data.add("DSC 2");
        data.add("DSC 3");
        data.add("DSC 4");
        data.add("DSC 5");
        data.add("DSC 6");
        data.add("DSC 7");
        data.add("DSC 8");
    }
}
