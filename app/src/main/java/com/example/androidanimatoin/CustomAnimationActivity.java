package com.example.androidanimatoin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAnimationActivity extends AppCompatActivity {
    AppCompatButton translateBtn, rotateBtn, scaleBtn, alphaBtn;
    TextView animText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_animation);

        getSupportActionBar().setTitle("Custom Animation");

        translateBtn = findViewById(R.id.translateBtn);
        rotateBtn = findViewById(R.id.rotateBtn);
        scaleBtn = findViewById(R.id.scaleBtn);
        alphaBtn = findViewById(R.id.alphaBtn);

        animText = findViewById(R.id.animText);

        translateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomAnimationActivity.this, "This is translate button", Toast.LENGTH_SHORT).show();
                Animation animTranslate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_animation);
                animText.startAnimation(animTranslate);
            }
        });

        rotateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomAnimationActivity.this, "This is rotate button", Toast.LENGTH_SHORT).show();
                Animation rotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
                animText.startAnimation(rotateAnimation);
            }
        });

        scaleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomAnimationActivity.this, "This is scale button", Toast.LENGTH_SHORT).show();
                Animation scaleAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale_animation);
                animText.startAnimation(scaleAnim);
            }
        });

        alphaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CustomAnimationActivity.this, "This is alpha button", Toast.LENGTH_SHORT).show();
                Animation alphaAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha_animation);
                animText.startAnimation(alphaAnim);
            }
        });
    }
}