package com.awesome.dylan.exploreuiuc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Intent i = getIntent();
        String act1 = i.getStringExtra("activity1");
        String act2 = i.getStringExtra("activity2");
        String act3 = i.getStringExtra("activity3");
        String his1 = i.getStringExtra("history1");
        String his2 = i.getStringExtra("history2");
        String his3 = i.getStringExtra("history3");
        configureButton();
        TextView activity1 = (TextView) findViewById(R.id.activity1);
        activity1.setText(act1);
        TextView activity2 = (TextView) findViewById(R.id.activity2);
        activity2.setText(act2);
        TextView activity3 = (TextView) findViewById(R.id.activity3);
        activity3.setText(act3);
        TextView history1 = (TextView) findViewById(R.id.history1);
        history1.setText(his1);
        TextView history2 = (TextView) findViewById(R.id.history2);
        history2.setText(his2);
        TextView history3 = (TextView) findViewById(R.id.history3);
        history3.setText(his3);
    }

    public void configureButton() {
        Button restart = findViewById(R.id.restartButton);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InfoActivity.this, MenuActivity.class);
                startActivity(i);
            }
        });
        }

}
