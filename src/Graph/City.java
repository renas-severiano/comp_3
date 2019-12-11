package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class City {
    private String name;
    private int cityID;
    private String districtName;
    private boolean cityHasWarehouse;
    private boolean hasRoad;
    private int roadsCounter;
    private HashMap<Road, Double> roads;

    public City(int cityID){
     this.cityID = cityID;
     name = null;
    }
    public City(String name, int cityID){
        this.cityID = cityID;
        this.name = name;
    }
    public City( String name, int cityID, String districtName,boolean cityHasWarehouse, boolean hasRoad, int roadsCounter){
        this(name, cityID);
        this.districtName = districtName;
        this.cityHasWarehouse = cityHasWarehouse;
        this.hasRoad = hasRoad;
        this.roadsCounter = roadsCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public boolean isCityHasWarehouse() {
        return cityHasWarehouse;
    }

    public void setCityHasWarehouse(boolean cityHasWarehouse) {
        this.cityHasWarehouse = cityHasWarehouse;
    }

    public boolean isHasRoad() {
        return hasRoad;
    }

    public void setHasRoad(boolean hasRoad) {
        this.hasRoad = hasRoad;
    }

    public int getRoadsCounter() {
        return roadsCounter;
    }

    public void setRoadsCounter(int roadsCounter) {
        this.roadsCounter = roadsCounter;
    }

    public HashMap<Road, Double> getRoads() {
        return roads;
    }

    public void setRoads(Road road) {

        this.roads.put(road, road.getDistanceKM());
    }
}
