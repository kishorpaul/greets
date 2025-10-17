package com.example.nestedscrollview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StatusViewHolder extends RecyclerView.ViewHolder {
    TextView username;
    ImageView image;

    public StatusViewHolder(@NonNull View itemView) {
        super(itemView);

        image = itemView.findViewById(R.id.status_card_item_image);
        username = itemView.findViewById(R.id.status_card_item_username);
    }
}
