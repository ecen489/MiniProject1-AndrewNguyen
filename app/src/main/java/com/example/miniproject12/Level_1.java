package com.example.miniproject12;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level_1 extends AppCompatActivity {
    int sequence=0;
    int score =0;
    TextView scoreview;
    MediaPlayer mp3;
    String isScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreview = (TextView) findViewById(R.id.keepscore);
        mp3 =MediaPlayer.create(this, R.raw.overworldtheme);
        mp3.setLooping(true);
        mp3.start();
    }
    @Override
    protected  void onPause()
    {
        if (mp3.isPlaying())
        {
            mp3.stop();
        }
        super.onPause();
    }
    @Override
    protected void onDestroy()
    {
        if (mp3.isPlaying())
        {
            mp3.stop();
        }
        super.onDestroy();
    }
    public void buttonpush1(View v)
    {
        if (sequence == 2)
        {
            sequence++;
        }
        else
        {
            sequence=0;
            score--;
            isScore= String.valueOf(score);
            scoreview.setText("Score: "+isScore);
        }
    }
    public void buttonpush2(View v)
    {
        if (sequence == 0)
        {
            sequence++;
        }
        else
        {
            sequence=0;
            score--;
            isScore= String.valueOf(score);
            scoreview.setText("Score: "+isScore);
        }
    }
    public void buttonpush3(View v)
    {
        if (sequence ==1)
        {
            sequence++;
        }
        else
        {
            sequence=0;
            score--;
            isScore= String.valueOf(score);
            scoreview.setText("Score: "+isScore);
        }
    }
    public void buttonpush4(View v)
    {
        if (sequence!=3)
        {
            sequence=0;
            score--;
            isScore= String.valueOf(score);
            scoreview.setText("Score: "+isScore);
        }
        else
        {
            score++;
            isScore= String.valueOf(score);
            scoreview.setText("Score: "+isScore);
            Intent intent = new Intent(this, Level_2.class);
            intent.putExtra("score",score);
            mp3.pause();
            startActivity(intent);
        }
    }
}
