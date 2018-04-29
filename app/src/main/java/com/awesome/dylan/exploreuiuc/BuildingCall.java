package com.awesome.dylan.exploreuiuc;

import java.util.Random;
import java.util.ArrayList;

import com.awesome.dylan.exploreuiuc.Building;

public class BuildingCall {
    static int counter = 0;
    public static Building getBuilding(ArrayList<Building> buildings) {
        Random rand = new Random();
        int id = rand.nextInt(Building.idIndex);
        if (counter < 25) {
            for (int i = 0; i < buildings.size(); i++) {
                if (buildings.get(i).id == id && buildings.get(i).visited == false) {
                    buildings.get(i).visited = true;
                    return buildings.get(i);
                }
            }
            counter++;
            return getBuilding(buildings);
        }
        for (int i = 0; i < buildings.size(); i++) {
            if (buildings.get(i).id == id) {
                buildings.get(i).visited = true;
                return buildings.get(i);
            }
        }
    return null;
    }
}
