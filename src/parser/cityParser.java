package parser;

import java.util.ArrayList;
import Graph.City;

public class cityParser {
    private ArrayList<String> cities;

    public cityParser(ArrayList<String> cities){
        this.cities = cities;
    }
    //CityName, CityID, DistrictName, HasWarehouse, HasRoads, Roads
    public static ArrayList<City> toCityObjects(ArrayList<String> all_cities) {
        ArrayList<City> cities_objects = new ArrayList<City>();

        for (String city_line : all_cities) {
            String[] elements = city_line.split(",");

            String CityName = elements[0];
            int CityID = Integer.parseInt(elements[1]);
            String DistrictName = elements[2];
            boolean hasWarehouse = elements[3].equals("Yes");
            boolean hasRoads = elements[4].equals("Yes");
            int Roads = Integer.parseInt(elements[5]);

            City city = new City(CityName, CityID,DistrictName,hasWarehouse,hasRoads,Roads);
            cities_objects.add(city);

        }
        return cities_objects;
    }
}
