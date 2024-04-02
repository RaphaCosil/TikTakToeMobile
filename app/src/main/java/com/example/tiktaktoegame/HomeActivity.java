package com.example.tiktaktoegame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        View buttonDuo = findViewById(R.id.buttonDuo);
        View buttonAndroid = findViewById(R.id.buttonAndroid);
        View buttonChat = findViewById(R.id.buttonChatGPT);

        buttonDuo.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, DuoGameActivity.class);
            startActivity(intent);
            finish();
        });
        buttonAndroid.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this,RandomGameActivity.class);
            startActivity(intent);
            finish();
        });
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(HomeActivity.this, DuoGameActivity.class);
//                startActivity(intent);
//                finish();
//            }
//
//        });
    }
}
