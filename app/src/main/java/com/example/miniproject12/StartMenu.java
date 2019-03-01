package com.example.miniproject12;

import android.media.MediaPlayer;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.ActivityInfo;
//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class StartMenu extends AppCompatActivity {
Button bn;
Button bn2;
MediaPlayer mp1;
ImageView image;
boolean status = false;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_menu);
        bn = (Button) findViewById(R.id.levelswitch);
        bn2= (Button) findViewById(R.id.button);
        image = (ImageView) findViewById(R.id.imageView3);

        mp1 = MediaPlayer.create(this,R.raw.smb);
        mp1.setLooping(true);
        mp1.start();
        bn.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v)
           {

                   FragmentManager fragmentManager = getSupportFragmentManager();
                   FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                   if (!status) {
                       mp1.pause();
                       image.setVisibility(View.INVISIBLE);
                       bn.setVisibility(View.INVISIBLE);
                       bn2.setVisibility(View.INVISIBLE);
                       levelswitcherfragment frag = new levelswitcherfragment();
                       fragmentTransaction.add(R.id.fragment_container, frag);
                       fragmentTransaction.commit();
                       status = true;


                   } else {
                       status = false;
                   }

           }
        });

    }

    @Override
    protected  void onPause()
    {
        if (mp1.isPlaying())
        {
            mp1.stop();
        }
        super.onPause();
    }
    @Override
    protected void onDestroy()
    {
        if (mp1.isPlaying())
        {
            mp1.stop();
        }
        super.onDestroy();
    }
    public void gamebuttonpush(View v) {
        Intent intent = new Intent(this, Level_1.class);
        mp1.pause();
        startActivity(intent);

    }


}
