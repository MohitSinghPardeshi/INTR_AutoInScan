package com.mohitsprojects.intr_one_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.mohitsprojects.intr_one_2.Adapter.awsAdapter;
import com.mohitsprojects.intr_one_2.Adapter.pinCodeAdapter;

import java.util.ArrayList;

public class awsActivity extends AppCompatActivity {
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aws);
        context = context;
        initFun();


    }

    private void initFun() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(awsActivity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        arrayList.add("DSKFJH1232SKDFJ");
        awsAdapter adapter = new awsAdapter(arrayList,this);

        recyclerView.setAdapter(adapter);

    }


}