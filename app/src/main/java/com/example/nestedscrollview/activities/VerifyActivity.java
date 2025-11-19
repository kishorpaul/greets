package com.example.nestedscrollview.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.nestedscrollview.R;
import com.google.android.material.button.MaterialButton;

public class VerifyActivity  extends AppCompatActivity {
    AppCompatButton verifyOtpButton;
    ImageButton closeButton;
    TextView mobNum;
    String intentMobNum;
    EditText verifyCode;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify_activity);

        verifyOtpButton = findViewById(R.id.signIn_verify_button);
        closeButton = findViewById(R.id.verify_back_button);
        mobNum = findViewById(R.id.signIn_verify_desc_mobNum);
        verifyCode = findViewById(R.id.verify_edit_text);

        intentMobNum = getIntent().getExtras().getString("phoneNum");
        mobNum.setText(intentMobNum);

        verifyOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyActivity.this, SignInProfile.class);
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
