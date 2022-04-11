package com.example.task;



import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Music extends AppCompatActivity {

    MediaPlayer mp1,mp2;
    Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
       mp1 = new MediaPlayer().create(Music.this, R.raw.cp);
        mp2 = new MediaPlayer().create(Music.this, R.raw.ex);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp2.pause();
                mp1.start();

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.pause();
                mp2.start();

            }
        });
    }
}