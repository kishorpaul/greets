package com.example.nestedscrollview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedscrollview.R;
import com.example.nestedscrollview.dataitems.StatusDataItem;
import com.example.nestedscrollview.viewholders.StatusViewHolder;

import java.util.ArrayList;

public class StatusAdapter extends RecyclerView.Adapter<StatusViewHolder> {
    ArrayList<StatusDataItem> statusDataItems;

    public StatusAdapter(ArrayList<StatusDataItem> statusDataItemsArrayList) {
        this.statusDataItems = statusDataItemsArrayList;
    }

    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.status_card_item, parent,false);

        return new StatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusViewHolder holder, int position) {
        StatusDataItem statusDataItem = statusDataItems.get(position);

        holder.username.setText(statusDataItem.getmUsername());
        holder.image.setImageResource(statusDataItem.getmImage());
    }

    @Override
    public int getItemCount() {
        return statusDataItems.size();
    }
}
