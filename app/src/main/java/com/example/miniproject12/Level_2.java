package com.example.miniproject12;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Level_2 extends AppCompatActivity {
RadioButton rb1;
RadioButton rb2;
RadioButton rb3;
RadioButton rb4;
RadioButton rb5;
    RadioButton rb6;
    RadioButton rb7;
    RadioButton rb8;
    RadioButton rb9;
    RadioButton rb15;
    RadioButton rb11;
    RadioButton rb12;
    RadioButton rb13;
    RadioButton rb14;
    RadioButton rb10;
    int ischecked=0;
    int score=0;
    TextView keepscore;
    String toscore;
    MediaPlayer mp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent mintent= getIntent();
        keepscore = (TextView) findViewById(R.id.keepscore2);
        score = mintent.getIntExtra("score",0);
         toscore= String.valueOf(score);
        keepscore.setText("Score: "+toscore);
        mp2 =MediaPlayer.create(this, R.raw.watertheme);
        mp2.setLooping(true);
        mp2.start();
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
        rb6 = (RadioButton) findViewById(R.id.radioButton6);
        rb7 = (RadioButton) findViewById(R.id.radioButton7);
        rb8 = (RadioButton) findViewById(R.id.radioButton8);
        rb9 = (RadioButton) findViewById(R.id.radioButton9);
        rb10 = (RadioButton) findViewById(R.id.radioButton10);
        rb11 = (RadioButton) findViewById(R.id.radioButton11);
        rb12 = (RadioButton) findViewById(R.id.radioButton12);
        rb13 = (RadioButton) findViewById(R.id.radioButton13);
        rb14 = (RadioButton) findViewById(R.id.radioButton14);
        rb15 = (RadioButton) findViewById(R.id.radioButton15);



    }
    public void g2buttonpush(View v)
    {
        if (rb1.isChecked())
        {
            ischecked++;
        }
        if (rb2.isChecked())
        {
            ischecked++;
        }
        if (rb3.isChecked())
        {
            ischecked++;
        }
        if (rb4.isChecked())
        {
            ischecked++;
        }
        if (rb5.isChecked())
        {
            ischecked++;
        }
        if (rb6.isChecked())
        {
            ischecked++;
        }
        if (rb7.isChecked())
        {
            ischecked++;
        }
        if (rb8.isChecked())
        {
            ischecked++;
        }
        if (rb9.isChecked())
        {
            ischecked++;
        }
        if (rb10.isChecked())
        {
            ischecked++;
        }
        if (rb11.isChecked())
        {
            ischecked++;
        }
        if (rb12.isChecked())
        {
            ischecked++;
        }
        if (rb13.isChecked())
        {
            ischecked++;
        }
        if (rb14.isChecked())
        {
            ischecked++;
        }
        if (rb15.isChecked())
        {
            ischecked++;
        }

        if (rb1.isChecked() && rb5.isChecked() && rb4.isChecked() && rb12.isChecked()&& rb11.isChecked() && rb13.isChecked() && ischecked==6)
        {
            score=score+1;
            toscore= String.valueOf(score);
            keepscore.setText("Score: "+ toscore);
            Intent intent = new Intent(this, Level_3.class);
            intent.putExtra("score",score);
            mp2.pause();
            startActivity(intent);
        }
        else {
            score--;
            toscore= String.valueOf(score);
            keepscore.setText("Score: "+toscore);

            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);
            rb4.setChecked(false);
            rb5.setChecked(false);
            rb6.setChecked(false);
            rb7.setChecked(false);
            rb8.setChecked(false);
            rb9.setChecked(false);
            rb10.setChecked(false);
            rb11.setChecked(false);
            rb12.setChecked(false);
            rb13.setChecked(false);
            rb14.setChecked(false);
            rb15.setChecked(false);
            ischecked=0;

        }

    }
public void g2resetpush(View v)
{
    rb1.setChecked(false);
    rb2.setChecked(false);
    rb3.setChecked(false);
    rb4.setChecked(false);
    rb5.setChecked(false);
    rb6.setChecked(false);
    rb7.setChecked(false);
    rb8.setChecked(false);
    rb9.setChecked(false);
    rb10.setChecked(false);
    rb11.setChecked(false);
    rb12.setChecked(false);
    rb13.setChecked(false);
    rb14.setChecked(false);
    rb15.setChecked(false);

    ischecked=0;
}
    @Override
    protected  void onPause()
    {
        if (mp2.isPlaying())
        {
            mp2.stop();
        }
        super.onPause();
    }
    @Override
    protected void onDestroy()
    {
        if (mp2.isPlaying())
        {
            mp2.stop();
        }
        super.onDestroy();
    }
}
