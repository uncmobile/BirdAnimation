package com.example.birdanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView im = findViewById(R.id.imgview);
        im.setBackgroundResource(R.drawable.birdseq);
        ((AnimationDrawable)im.getBackground()).start();

        Animation x = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.myrotate);
        im.setAnimation(x);

    }
}