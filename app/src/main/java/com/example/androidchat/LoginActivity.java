package com.example.androidchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageButton hyper = findViewById(R.id.register_link);
        hyper.setOnClickListener(v -> {
            Intent i = new Intent(this,RegisterActivity.class);
            startActivity(i);
        });
    }
}