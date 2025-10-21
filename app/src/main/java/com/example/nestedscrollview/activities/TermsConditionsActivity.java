package com.example.nestedscrollview.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.nestedscrollview.R;

public class TermsConditionsActivity extends AppCompatActivity {

    Button continueBtn;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terms_condition_activity);

        continueBtn = findViewById(R.id.t_c_button);

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TermsConditionsActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
