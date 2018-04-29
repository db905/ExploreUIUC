package com.awesome.dylan.exploreuiuc;

import java.util.Random;
import java.util.ArrayList;

import com.awesome.dylan.exploreuiuc.Building;

public class BuildingCall {
    static int size = Building.listSize;
    static ArrayList<Building> buildings = Building.buildingList;
    static int counter = 0;
    public static Building getBuilding() {
        Random rand = new Random();
        int id = rand.nextInt(Building.idIndex);
        if (counter < 25) {
            for (int i = 0; i < size; i++) {
                if (buildings.get(i).id == id && buildings.get(i).visited == false) {
                    buildings.get(i).visited = true;
                    return buildings.get(i);
                }
            }
            counter++;
            return getBuilding();
        }
        for (int i = 0; i < size; i++) {
            if (buildings.get(i).id == id) {
                buildings.get(i).visited = true;
                return buildings.get(i);
            }
        }
    return null;
    }
}
