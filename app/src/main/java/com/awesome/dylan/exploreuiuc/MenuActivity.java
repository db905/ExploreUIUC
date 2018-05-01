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

        /**
         * Adds all buildings in the app.
         */
        /*Building armory = new Building("Armory Building", "505 E Armory Ave");
        buildingList.add(armory);
        Building union = new Building("Illini Union", "1401 W Green St");
        buildingList.add(union);*/

        Building altgeld = new Building("Altgeld Hall", "1409 W Green St");
        buildingList.add(altgeld);
        altgeld.addActivity("Take a tour of the bell tower, and request a song to be played on the chimes!");
        altgeld.addActivity("Find a book published before 1600 A.D. in the Mathematics Library.");
        altgeld.addActivity("Find Professor Bruce Reznick and take a picture with his colorful shirt du jour!");
        altgeld.addHistory("The exterior features the only gargoyle on campus.");
        altgeld.addHistory("Altgeld made a brief appearance in the 1945 film, The House on 92nd Street.");
        altgeld.addHistory("The University chimes consists of 15 bells, weighing a total of seven and a half tons.");
        altgeld.addImage("altgeld.png");

        /*Building siebel = new Building("Siebel Center for Computer Science", "201 N Goodwin Ave");
        buildingList.add(siebel);

        Building krannert = new Building( "Krannert Center for the Performing Arts", "500 S Goodwin Ave");
        buildingList.add(krannert);

        Building illiniHall = new Building("Illini Hall", "725 S Wright St");
        buildingList.add(illiniHall);

        Building lincoln = new Building("Lincoln Hall", "702 S Wright St");
        buildingList.add(illiniHall);

        Building dkh = new Building("David Kinley Hall", "1407 W Gregory Dr");
        buildingList.add(dkh);

        Building noyes = new Building("Noyes Laboratory", "505 S Mathews Ave");
        buildingList.add(noyes);

        Building english = new Building("English Building", "608 S Wright St");
        buildingList.add(english);

        Building greg = new Building("Gregory Hall", "810 S Wright St");
        buildingList.add(greg);

        Building business = new Building("Business Instructional Facility", "515 E Gregory Dr");
        buildingList.add(business);

        Building mumford = new Building("Mumford Hall", "1301 W Gregory Dr");
        buildingList.add(mumford);

        Building templeHBH = new Building("Temple Hoyne Buell Hall", "611 Lorado Taft Dr");
        buildingList.add(templeHBH);

        Building wohlers = new Building("Wohlers Hall", "1206 S 6th St");
        buildingList.add(wohlers);

        Building ceramics = new Building("Ceramics Building", "105 S Goodwin Ave");
        buildingList.add(ceramics);

        Building turner = new Building(" Turner Hall", "1102 S Goodwin Ave");
        buildingList.add(turner);

        Building freer = new Building("Freer Hall", "906 S Goodwin Ave");
        buildingList.add(freer);*/
    }

    private void configurePlayButton() {
        Button play = findViewById(R.id.playButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Building subject = BuildingCall.getBuilding(buildingList);
                Intent i = new Intent(MenuActivity.this, WelcomeActivity.class);
                i.putExtra("Bname", subject.name);
                i.putExtra("activity1", subject.activities.get(0));
                i.putExtra("activity2", subject.activities.get(1));
                i.putExtra("activity3", subject.activities.get(2));
                i.putExtra("history1", subject.history.get(0));
                i.putExtra("history2", subject.history.get(1));
                i.putExtra("history3", subject.history.get(2));
                i.putExtra("image", subject.image);
                startActivity(i);
                //intent.putExtra()
            }
        });
    }
}