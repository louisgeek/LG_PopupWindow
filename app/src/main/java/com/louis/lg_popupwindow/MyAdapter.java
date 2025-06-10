package com.louis.lg_popupwindow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Classichu on 2017/11/22.
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<String> stringList = new ArrayList<>();

    public MyAdapter(List<String> stringList) {
        this.stringList = stringList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.id_tv.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView id_tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            id_tv = itemView.findViewById(R.id.id_tv);
        }
    }
}