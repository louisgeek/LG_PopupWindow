package com.classichu.classicpopupwindow;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content, parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.id_tv.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView id_tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            id_tv = (TextView) itemView.findViewById(R.id.id_tv);
        }
    }
}