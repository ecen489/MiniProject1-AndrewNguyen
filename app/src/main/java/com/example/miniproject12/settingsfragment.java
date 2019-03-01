package com.example.miniproject12;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class settingsfragment extends Fragment {
    MediaPlayer mp3;
    Button bn5;
    int scorefinal;
    TextView finalscore;

    public settingsfragment() {
        // Required empty public constructor
        setRetainInstance(true);
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.settingsfragment, container, false);
        mp3 = MediaPlayer.create(getActivity(), R.raw.smg2);
        mp3.setLooping(true);
        mp3.start();
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            scorefinal = getArguments().getInt("score");
        }
        finalscore = (TextView) view.findViewById(R.id.textView11);
        String toscore = String.valueOf(scorefinal);
        finalscore.setText("Score: " + toscore);
        bn5 = (Button) view.findViewById(R.id.mutebutton);
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();
                Intent intent = new Intent(getActivity(), StartMenu.class);
                startActivity(intent);
            }
        });


        return view;
    }
    public void onDestroyView() {
        mp3.stop();
        super.onDestroyView();

    }
    public void onPause(){
        mp3.stop();
        super.onPause();
    }
}
