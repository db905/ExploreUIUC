package com.awesome.dylan.exploreuiuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class welcomeActivity extends AppCompatActivity {

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
    }

    public void configureNextButton() {
        Button next = (Button) findViewById(R.id.infoButton);
    }
}
