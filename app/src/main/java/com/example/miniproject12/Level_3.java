package com.example.miniproject12;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Level_3 extends AppCompatActivity {
EditText ans;
TextView keepscore;
int score=0;
String toscore;
ImageView img;
TextView txt5;
TextView txt6;
TextView txt7;
TextView txt8;
TextView txt9;
TextView txt10;
Button bn;
MediaPlayer mp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
        Intent mintent = getIntent();
        score = mintent.getIntExtra("score",0);
        keepscore = (TextView) findViewById(R.id.keepscore3);
         toscore = String.valueOf(score);
        keepscore.setText("Score: "+toscore);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mp4 = MediaPlayer.create(this, R.raw.metallicmario);
        mp4.setLooping(true);
        mp4.start();

    }

    @Override
    protected  void onPause()
    {
        if (mp4.isPlaying())
        {
            mp4.stop();
        }
        super.onPause();
    }
    @Override
    protected void onDestroy()
    {
        if (mp4.isPlaying())
        {
            mp4.stop();
        }
        super.onDestroy();
    }
 public void g3buttonpush(View v){
        ans = (EditText) findViewById(R.id.editText);
        String answer = ans.getText().toString();
        if (answer.equals("white") || answer.equals("White"))
        {
            score++;
             toscore = String.valueOf(score);
            keepscore.setText("Score: "+toscore);
           // Intent intent = new Intent(this, StartMenu.class);
           // startActivity(intent);
            mp4.pause();
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            img = (ImageView) findViewById(R.id.imageView2);
            txt5 = (TextView) findViewById(R.id.textView5);
            txt6 = (TextView) findViewById(R.id.textView6);
            txt7 = (TextView) findViewById(R.id.textView7);
            txt8 = (TextView) findViewById(R.id.textView8);
            txt9 = (TextView) findViewById(R.id.textView9);
            txt10 = (TextView) findViewById(R.id.textView10);
            bn = (Button) findViewById(R.id.g3button);
            img.setVisibility(View.INVISIBLE);
            txt5.setVisibility(View.INVISIBLE);
            txt6.setVisibility(View.INVISIBLE);
            txt7.setVisibility(View.INVISIBLE);
            txt8.setVisibility(View.INVISIBLE);
            txt9.setVisibility(View.INVISIBLE);
            txt10.setVisibility(View.INVISIBLE);
            bn.setVisibility(View.INVISIBLE);
            keepscore.setVisibility(View.INVISIBLE);
            ans.setVisibility(View.INVISIBLE);
            Bundle bundle = new Bundle();
            bundle.putInt("score",score);

                settingsfragment frag2 = new settingsfragment();
                frag2.setArguments(bundle);
                fragmentTransaction.add(R.id.fragment_container_2, frag2);
                fragmentTransaction.commit();

        }
        else
        {
            score--;
            toscore = String.valueOf(score);
            keepscore.setText("Score: "+toscore);
            ans.getText().clear();
        }
 }
}
