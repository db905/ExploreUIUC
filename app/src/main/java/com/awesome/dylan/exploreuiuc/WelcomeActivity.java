package com.awesome.dylan.exploreuiuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        configureNextButton();
        Intent i = getIntent();
        String bname = i.getStringExtra("Bname");
        TextView welcomeView = (TextView) findViewById(R.id.buildingName);
        welcomeView.setText("Welcome to " + bname);
        // add map intent
        ImageView buildingPic = (ImageView) findViewById(R.id.buildingPic);
        //buildingPic.setImageResource(/**int resourceID*/);
    }

    public void configureNextButton() {
        Button info = (Button) findViewById(R.id.infoButton);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WelcomeActivity.this, InfoActivity.class);
                startActivity(i);
            }
        });
    }
}
