package com.awesome.dylan.exploreuiuc;

import java.util.ArrayList;

public class Building {
    String name;
    String address;
    String image;
    int id;
    boolean visited = false;
    ArrayList<String> activities;
    ArrayList<String> history;
    static int idIndex = 0;
    Building(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = idIndex;
        idIndex++;
    }
    public void addActivity(String activity) {
        this.activities.add(activity);
    }
    public void addHistory(String fact) {
        history.add(fact);
    }

}
