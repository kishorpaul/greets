package com.example.nestedscrollview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessageViewHolder extends RecyclerView.ViewHolder {
    TextView userName, message;
    ImageView image;

    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);

        userName = itemView.findViewById(R.id.messages_card_item_username);
        message = itemView.findViewById(R.id.messages_card_item_message);
        image = itemView.findViewById(R.id.messages_card_item_image);

    }
}
