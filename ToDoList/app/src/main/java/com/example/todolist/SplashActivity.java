package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    Timer timer;
    Animation animlogo;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        animlogo = AnimationUtils.loadAnimation(this, R.anim.animationlogo);
        logo = (ImageView) findViewById(R.id.logo);

        logo.startAnimation(animlogo);

        timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}