package com.mohitsprojects.intr_one_2.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mohitsprojects.intr_one_2.R;

import java.util.ArrayList;

public class awsAdapter extends RecyclerView.Adapter<awsAdapter.ViewHolder> {
    private final ArrayList<String> arrayList;
    private final Context context;

    public awsAdapter(ArrayList<String> arrayList, Context context) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.awslist_item,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.awsTv.setText(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView awsTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            awsTv = itemView.findViewById(R.id.awsId);
        }
    }
}


