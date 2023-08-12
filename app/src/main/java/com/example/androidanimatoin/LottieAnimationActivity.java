package com.example.androidanimatoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LottieAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_animation);

        getSupportActionBar().setTitle("Lottie Animation");
    }
}