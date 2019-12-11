package com.company;


import parser.*;
import util.*;
import Graph.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

    private static ArrayList<City> citiesFinal;
    private static ArrayList<Road> roadsFinal;

    public static void main(String[] args) {
	CSVReader reader = new CSVReader("database");
	ArrayList<String> all_cities = reader.load("city.csv");
	System.out.println(all_cities);

	citiesFinal = cityParser.toCityObjects(all_cities);

    System.out.println("\nCities have been loaded. CIties: "+citiesFinal.size());

    ArrayList<String> all_roads = reader.load("road.csv");

    System.out.println(all_roads);

    roadsFinal = roadParser.toRoadObjects(all_roads);

    for(int i = 0; i< citiesFinal.size(); ++i){
        City city = citiesFinal.get(i);

        ArrayList<Road> roads = new ArrayList<Road>();
        for(int j  = 0 ; j < roadsFinal.size(); ++j){
            Road road = roadsFinal.get(j);
            if(road.getOriginCityID() == city.getCityID()){
                roads.add(road);
            }
        }

        city.setRoads(roads);
    }

    Graph<City> graph = new Graph<City>(citiesFinal);

    System.out.println("\nRoads have been loaded. Roads: "+roadsFinal.size());

        System.out.println(roadsFinal.get(9).getOriginCityName());


    }

}
