package com.example.androidchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ImageButton hyper = findViewById(R.id.login_link);
        hyper.setOnClickListener(v -> {
            Intent i = new Intent(this,LoginActivity.class);
            startActivity(i);
        });
    }
}