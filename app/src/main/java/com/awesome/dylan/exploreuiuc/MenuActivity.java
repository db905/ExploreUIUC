package com.awesome.dylan.exploreuiuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import com.awesome.dylan.exploreuiuc.BuildingCall;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    ArrayList<Building> buildingList;

    static Building subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        configurePlayButton();
        buildingList = new ArrayList<Building>();
        Building armory = new Building("Armory Building", "505 E Armory Ave");//add building list here
        buildingList.add(armory);
    }

    private void configurePlayButton() {
        Button play = findViewById(R.id.playButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Building subject = BuildingCall.getBuilding(buildingList);
                Intent i = new Intent(MenuActivity.this, welcomeActivity.class);
                i.putExtra("Bname",subject.name);
                startActivity(i);
                //intent.putExtra()
            }
        });
    }
}