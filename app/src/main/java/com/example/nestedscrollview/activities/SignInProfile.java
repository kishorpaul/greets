package com.example.nestedscrollview.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.nestedscrollview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SignInProfile extends AppCompatActivity {
    AppCompatButton updateBtn;
    ImageButton closeBtn;
    EditText username;
    CircleImageView profileImage;

    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_profile);

        updateBtn = findViewById(R.id.sign_in_profile_update);
        closeBtn = findViewById(R.id.sign_in_profile_close_button);
        username = findViewById(R.id.sign_in_profile_select_username);
        profileImage = findViewById(R.id.sign_in_profile_select_image);

        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInProfile.this, TermsConditionsActivity.class);
                startActivity(intent);
                finish();
            }
        });

        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInProfile.this, MainActivity.class);
                intent.putExtra("username", username.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}
