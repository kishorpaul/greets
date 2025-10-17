package com.example.nestedscrollview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {
    ArrayList<MessagesDataItem> mMessagesDataItemArrayList;

    public MessageAdapter(ArrayList<MessagesDataItem> messagesDataItemArrayList){
        this.mMessagesDataItemArrayList = messagesDataItemArrayList;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.messages_card_item, parent, false);

        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        MessagesDataItem messagesDataItem = mMessagesDataItemArrayList.get(position);

        holder.userName.setText(messagesDataItem.getmUsername());
        holder.message.setText(messagesDataItem.getmMessage());
        holder.image.setImageResource(messagesDataItem.getmImage());
    }

    @Override
    public int getItemCount() {
        return mMessagesDataItemArrayList.size();
    }
}
