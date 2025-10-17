package com.example.nestedscrollview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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