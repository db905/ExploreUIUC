package com.awesome.dylan.exploreuiuc;

import java.util.ArrayList;

public class Building {
    String name;
    String address;
    int id;
    boolean visited = false;
    ArrayList<String> activities;
    ArrayList<String> history;
    static int idIndex = 0;
    static ArrayList<Building> buildingList;
    static int listSize = buildingList.size();
    Building(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = idIndex;
        idIndex++;
        buildingList.add(this);
    }
    public void addActivity(String activity) {
        this.activities.add(activity);
    }
    public void addHistory(String fact) {
        history.add(fact);
    }
}
