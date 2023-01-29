package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    Timer timer;
    Animation animlogo, animtext;
    ImageView logo;

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.school_app);
        mediaPlayer.start();

        animtext = AnimationUtils.loadAnimation(this,R.anim.anmationtext);
        animlogo = AnimationUtils.loadAnimation(this, R.anim.animationlogo);
        logo = (ImageView) findViewById(R.id.logo);
        text = (TextView) findViewById(R.id.todolist);

        logo.startAnimation(animlogo);
        text.startAnimation(animtext);
        timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                mediaPlayer.stop();
                Intent intent = new Intent(SplashActivity.this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 2800);
    }
}