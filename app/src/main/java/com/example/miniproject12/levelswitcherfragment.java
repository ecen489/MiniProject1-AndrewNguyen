package com.example.miniproject12;

import android.content.Intent;
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
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class levelswitcherfragment extends Fragment {
ListView listView;
MediaPlayer mp0;
    public levelswitcherfragment() {
        // Required empty public constructor
        setRetainInstance(true);
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.levelswitcherfragment,container, false);
        mp0 = MediaPlayer.create(getActivity(), R.raw.smwoverworld);
        mp0.setLooping(true);
        mp0.start();
        String[] menuItems = {"title screen", "Level 1", "Level 2", "Level 3"};
        ListView listView =(ListView) view.findViewById(R.id.list);
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,menuItems);
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {

                    case 0:
                        mp0.pause();
                        Intent newactivity = new Intent(getActivity(), StartMenu.class);
                        startActivity(newactivity);
                        break;
                    case 1:
                        mp0.pause();

                        Intent newactivity1 = new Intent(getActivity(), Level_1.class);
                            startActivity(newactivity1);
                            break;
                    case 2:
                        mp0.pause();

                        Intent newactivity2 = new Intent(getActivity(), Level_2.class);
                            startActivity(newactivity2);
                            break;
                    case 3:
                        mp0.pause();

                        Intent newactivity3 = new Intent(getActivity(), Level_3.class);
                            startActivity(newactivity3);
                            break;



                }
            }
        });


        return view;
    }


}
