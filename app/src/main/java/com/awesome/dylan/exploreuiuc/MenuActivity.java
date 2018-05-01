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
        altgeld.addActivity("Look out for a girl: height - 4'11, long dark hair. Ask her about the Hairy Ball Theorem.");
        altgeld.addActivity("Find Professor Bruce Reznick and take a picture with his colorful shirt du jour!");
        altgeld.addHistory("The exterior features the only gargoyle on campus.");
        altgeld.addHistory("Altgeld made a brief appearance in the 1945 film, The House on 92nd Street.");
        altgeld.addHistory("The University chimes consists of 15 bells, weighing a total of seven and a half tons.");
        altgeld.addImage("altgeld");

        Building siebel = new Building("Thomas M. Siebel Center for Computer Science", "201 N Goodwin Ave");
        buildingList.add(siebel);
        siebel.addActivity("Grab a bagel and coffee from Einstein's! It's a go-to meal for most CS students at UIUC.");
        siebel.addActivity("Check out the outdoor patio (if you can find it)!");
        siebel.addActivity("Find the OLDEST piece of technology in the building.");
        siebel.addHistory("The Siebel Center houses more than 225,000 square feet of classrooms, laboratories, and offices.");
        siebel.addHistory("In 2005, two Illinois CS alumni created YouTube, a video sharing website.");
        siebel.addHistory("Siebel features a modern north facade to reflect the cutting edge activities within.");
        siebel.addImage("siebel");

        Building krannert = new Building( "Krannert Center for the Performing Arts", "500 S Goodwin Ave");
        buildingList.add(krannert);
        krannert.addActivity("Buy a ticket and attend a performance!");
        krannert.addActivity("Try finding room 4506!");
        krannert.addActivity("Find signatures of celebrities that have performed and/or attended performances at KCPA.");
        krannert.addHistory("The main lobby features a floor made of teak from Thailand, and marble walls from Carrara, Italy.");
        krannert.addHistory("At the Tryon Festival Theatre, a trap door may be placed anywhere on stage with removable panels.");
        krannert.addHistory("Dr. Cyril Harris, designed the interior of the Foellinger Great Hall (and the Met. Opera in NYC!)");
        krannert.addImage("krannert");

        Building english = new Building("English Building", "608 S Wright St");
        buildingList.add(english);
        english.addActivity("Read and contribute to graffiti in the bathrooms.");
        english.addActivity("Try to meet the 108 year old ghost that haunts the English Building.");
        english.addActivity("Find the pineapple spires! (Yes, google what spire means too)");
        english.addHistory("The building originally served as a women's dormitory, with a pool and a gymnasium.");
        english.addHistory("It has formerly contained the Department of Economics.");
        english.addHistory("Designed by McKim, Mead, and White, one of the most famous firms at the time, cost $80,000.");
        english.addImage("english");

        Building ceramics = new Building("Ceramics Building", "105 S Goodwin Ave");
        buildingList.add(ceramics);
        ceramics.addActivity("Find ten differences in the bricks on the first floor.");
        ceramics.addActivity("See if you can fit inside the old kiln!");
        ceramics.addActivity("Knock on the door of a lab and bother a grad student. ");
        ceramics.addHistory("In 1914, the State of Illinois ranked fourth in the country in the value of its ceramic exports.");
        ceramics.addHistory("The Ceramic Engineering Kiln House and the Mining Engineering Laboratory used to be housed in the same building.");
        ceramics.addHistory("In 1989, the Metallurgy, Mining and Ceramics were merged to form Materials Science and Engineering!");
        ceramics.addImage("ceramics");
/*
        Building illiniHall = new Building("Illini Hall", "725 S Wright St");
        buildingList.add(illiniHall);

        Building lincoln = new Building("Lincoln Hall", "702 S Wright St");
        buildingList.add(illiniHall);

        Building dkh = new Building("David Kinley Hall", "1407 W Gregory Dr");
        buildingList.add(dkh);

        Building noyes = new Building("Noyes Laboratory", "505 S Mathews Ave");
        buildingList.add(noyes);

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
            }
        });
    }
}