package com.example.nestedscrollview.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedscrollview.R;

public class MessageViewHolder extends RecyclerView.ViewHolder {
    public TextView userName, message;
    public ImageView image;

    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);

        userName = itemView.findViewById(R.id.messages_card_item_username);
        message = itemView.findViewById(R.id.messages_card_item_message);
        image = itemView.findViewById(R.id.messages_card_item_image);

    }
}
