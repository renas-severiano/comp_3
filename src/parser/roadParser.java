package parser;
import java.util.ArrayList;
import Graph.Road;

public class roadParser {
        private ArrayList<String> roads;

        public roadParser(ArrayList<String> roads){
            this.roads = roads;
        }
        //RoadId,Group,OriginCityId,OriginCityName,Paths,AdjacencyId,AdjacencyCityName,DistanceKM,TimeHours,FuelCost,TollCost,DriverCost
        public static ArrayList<Road> toRoadObjects(ArrayList<String> all_roads) {
            ArrayList<Road> roads_objects = new ArrayList<Road>();

            for (String road_line : all_roads) {
                String[] elements = road_line.split(",");

                 int roadID = Integer.parseInt(elements[0]);
                 char group = elements[1].charAt(0);
                 int originCityID = Integer.parseInt(elements[2]);
                 String originCityName = elements[3];
                 int paths = Integer.parseInt(elements[4]);
                 int adjacencyID = Integer.parseInt(elements[5]);

                 String adjacencyCityName = elements[6];
                 double distanceKM = Double.parseDouble(elements[7]);
                 double timeHours = Double.parseDouble(elements[8]);
                 double fuelCost = Double.parseDouble(elements[9]);
                 double tollCost = Double.parseDouble(elements[10]);
                 double driverCost = Double.parseDouble(elements[11]);


                Road road = new Road(roadID,group,originCityID,originCityName,paths,adjacencyID,adjacencyCityName,distanceKM,timeHours,fuelCost,tollCost,driverCost);
                roads_objects.add(road);

            }
            return roads_objects;
        }
}