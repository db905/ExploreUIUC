package com.awesome.dylan.exploreuiuc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

import java.io.File;

public class WelcomeActivity extends AppCompatActivity {

    String bname;
    String act1;
    String act2;
    String act3;
    String his1;
    String his2;
    String his3;
    String image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        configureNextButton();
        Intent i = getIntent();
        bname = i.getStringExtra("Bname");
        act1 = i.getStringExtra("activity1");
        act2 = i.getStringExtra("activity2");
        act3 = i.getStringExtra("activity3");
        his1 = i.getStringExtra("history1");
        his2 = i.getStringExtra("history2");
        his3 = i.getStringExtra("history3");
        image = i.getStringExtra("image");
        TextView welcomeView = (TextView) findViewById(R.id.buildingName);
        welcomeView.setText("Your Destination is " + bname);
        // add map intent
        ImageView buildingPic = (ImageView) findViewById(R.id.buildingPic);
        Log.d("IMAGE ASSET LOAD", image);
        File img = new File("app/pics/" + image);
        Log.d("IMAGE FILE OBJECT", img.getPath());
        String curr = System.getProperty("user.dir");
        Log.d("CURRENT DIRECTORY", curr);
        buildingPic.setImageURI(Uri.fromFile(img));
        //buildingPic.setImageResource(/**int resourceID*/);
    }

    public void configureNextButton() {
        Button info = (Button) findViewById(R.id.nextButton);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WelcomeActivity.this, InfoActivity.class);
                i.putExtra("activity1", act1);
                i.putExtra("activity2", act2);
                i.putExtra("activity3", act3);
                i.putExtra("history1", his1);
                i.putExtra("history2", his2);
                i.putExtra("history3", his3);
                startActivity(i);
            }
        });
    }
}
