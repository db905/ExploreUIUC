package com.awesome.dylan.exploreuiuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import com.awesome.dylan.exploreuiuc.BuildingCall;

public class MenuActivity extends AppCompatActivity {

    static Building subject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        configurePlayButton();
    }

    private void configurePlayButton() {
        Button play = findViewById(R.id.playButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Building subject = BuildingCall.getBuilding();
                startActivity(new Intent(MenuActivity.this, MapsActivity.class));
            }
        });
    }
}