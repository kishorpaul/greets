package com.example.nestedscrollview.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nestedscrollview.R;

public class SearchActivity extends AppCompatActivity {

    ImageButton search_enter, search_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        search_enter = findViewById(R.id.search_send);
        search_back = findViewById(R.id.search_back_page);

        search_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
                onBackPressed();
            }
        });
    }
}