package com.example.tiktaktoegame;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {

    ImageView imgSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgSplash= findViewById(R.id.imageView);
        Glide.with(this).load("https://img.itch.zone/aW1nLzIxNzQ2MzAuZ2lm/original/uOr674.gif")
                .centerCrop().into(imgSplash);
        new Handler(Looper.getMainLooper()).postDelayed(this::openScreen, 5000);
    }

    private void openScreen() {
        Intent intent =new Intent(SplashScreenActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}