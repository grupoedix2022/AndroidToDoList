package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.content.Intent;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity2 extends AppCompatActivity {
    Timer timer;
    Animation animlogo, animtext;
    ImageView logo;

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        getSupportActionBar().hide();

        animlogo = AnimationUtils.loadAnimation(this,R.anim.animationlogo);
        animtext = AnimationUtils.loadAnimation(this, R.anim.animbienvenido);

        logo = (ImageView) findViewById(R.id.logosplash2);
        text = (TextView) findViewById(R.id.bienvenido);

        logo.startAnimation(animlogo);
        text.startAnimation(animtext);

        timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity2.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }


}