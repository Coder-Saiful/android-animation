package com.example.androidanimatoin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    AppCompatButton customAnim, lottieAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Animation");

        customAnim = findViewById(R.id.customAnim);
        lottieAnim = findViewById(R.id.lottieAnim);

        customAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent customAnimScreen = new Intent(MainActivity.this, CustomAnimationActivity.class);
                startActivity(customAnimScreen);
            }
        });

        lottieAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent customAnimScreen = new Intent(MainActivity.this, LottieAnimationActivity.class);
                startActivity(customAnimScreen);
            }
        });
    }
}