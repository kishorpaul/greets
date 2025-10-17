package com.example.nestedscrollview;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    RecyclerView messageRecyclerView, statusRecyclerView;
    ArrayList<MessagesDataItem> messagesDataItemArrayList;
    ArrayList<StatusDataItem> statusDataItemsArrayList;
    LinearLayout emptyStatusLayout;
    TextView emptyMessageText, emptyStatusText;
    EditText searchInput;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        messageRecyclerView = findViewById(R.id.main_messages_recycler_view);
        statusRecyclerView = findViewById(R.id.main_status_recycler_view);
        emptyStatusText = findViewById(R.id.main_status_recycler_view_emptyText);
        emptyMessageText = findViewById(R.id.main_messages_recycler_view_emptyText);
        searchInput = findViewById(R.id.main_search_edit_text);

        searchInput.setFocusable(false);
        searchInput.setFocusableInTouchMode(false);

        searchInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(intent);
//                finish();
            }
        });

        statusDataItemsArrayList = new ArrayList<>();
        for (int i=0; i<20; i++){
            statusDataItemsArrayList.add(new StatusDataItem(R.drawable.ic_launcher_background, "Kishor"));
        }

        messagesDataItemArrayList = new ArrayList<>();
        for(int i=0; i<20; i++){
            messagesDataItemArrayList.add(new MessagesDataItem("Kishor","Yo! This is the new chat application which is Swadeshi. Let's grow it.", R.drawable.ic_launcher_background));
        }

        LinearLayoutManager messagesLayout = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false);
        LinearLayoutManager statusLayout = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL,false);

        if(statusDataItemsArrayList.isEmpty()){
            emptyStatusText.setVisibility(VISIBLE);
            statusRecyclerView.setVisibility(GONE);
        }else {
            emptyStatusText.setVisibility(GONE);
            statusRecyclerView.setVisibility(VISIBLE);
            statusRecyclerView.setLayoutManager(statusLayout);
            statusRecyclerView.setAdapter(new StatusAdapter(statusDataItemsArrayList));
        }

        if(messagesDataItemArrayList.isEmpty()){
            emptyMessageText.setVisibility(VISIBLE);
            messageRecyclerView.setVisibility(GONE);
        }else {
            emptyMessageText.setVisibility(GONE);
            messageRecyclerView.setVisibility(VISIBLE);
            messageRecyclerView.setLayoutManager(messagesLayout);
            messageRecyclerView.setAdapter(new MessageAdapter(messagesDataItemArrayList));
        }
    }
}