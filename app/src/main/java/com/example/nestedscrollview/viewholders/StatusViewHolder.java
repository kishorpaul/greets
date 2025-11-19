package com.example.nestedscrollview.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedscrollview.R;

public class StatusViewHolder extends RecyclerView.ViewHolder {
    public TextView username;
    public ImageView image1, image2;

    public StatusViewHolder(@NonNull View itemView) {
        super(itemView);

        image1 = itemView.findViewById(R.id.status_card_item_image);
        image2 = itemView.findViewById(R.id.status_card_item_image_bg);
        username = itemView.findViewById(R.id.status_card_item_username);
    }
}
