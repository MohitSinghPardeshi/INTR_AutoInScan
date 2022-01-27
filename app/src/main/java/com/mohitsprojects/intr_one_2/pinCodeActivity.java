package com.mohitsprojects.intr_one_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.mohitsprojects.intr_one_2.Adapter.pinCodeAdapter;
import com.mohitsprojects.intr_one_2.DataObject.AWSData;

import java.util.ArrayList;

public class pinCodeActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_code);
        context = context;
        initFun();
    }

    private void initFun() {
        RecyclerView recyclerView = findViewById(R.id.pinCodeRV);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(pinCodeActivity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<AWSData> arrayList = new ArrayList<AWSData>();
        AWSData line1 = new AWSData("420812345678", "40001", "200");
        arrayList.add(line1);
        arrayList.add(line1);
        arrayList.add(line1);
        arrayList.add(line1);
        arrayList.add(line1);
        arrayList.add(line1);
        pinCodeAdapter adapter = new pinCodeAdapter(arrayList,this);

        recyclerView.setAdapter(adapter);
    }
}