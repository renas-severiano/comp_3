package com.company;


import parser.*;
import util.*;
import Graph.*;

import java.util.ArrayList;

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

    System.out.println("\nRoads have been loaded. Roads: "+roadsFinal.size());

        System.out.println(roadsFinal.get(9).getOriginCityName());


    }

}
