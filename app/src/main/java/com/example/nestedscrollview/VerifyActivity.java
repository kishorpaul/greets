package com.example.nestedscrollview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VerifyActivity  extends AppCompatActivity {
    Button verifyOtpButton;
    ImageButton closeButton;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify_activity);

        verifyOtpButton = findViewById(R.id.signIn_verify_button);
        closeButton = findViewById(R.id.verify_back_button);

        verifyOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
