package com.example.nestedscrollview.activities;

import static java.lang.Thread.sleep;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.nestedscrollview.R;
import com.example.nestedscrollview.utility.CustomProgress;
import com.razzaghimahdi78.dotsloading.linear.LoadingScaly;

public class SignInActivity extends AppCompatActivity {

    Button getOtpButton;
    ImageButton closeButton;
    LoadingScaly loadingScaly;
    CustomProgress customProgress;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);

        getOtpButton = findViewById(R.id.mob_sendOTP_button);
        closeButton = findViewById(R.id.signIn_close_button);
        loadingScaly = findViewById(R.id.signIn_dots_loading);

        customProgress = new CustomProgress(this);

        getOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customProgress.show();
//                Intent intent = new Intent(SignInActivity.this, VerifyActivity.class);
//                startActivity(intent);
//                finish();
//                customProgress.dismiss();
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, TermsConditionsActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
