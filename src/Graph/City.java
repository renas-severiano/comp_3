package Graph;

import java.util.ArrayList;

public class City {
    private String name;
    private int cityID;
    private String districtName;
    private boolean cityHasWarehouse;
    private boolean hasRoad;
    private int roads;

    public City(int cityID){
     this.cityID = cityID;
     name = null;
    }
    public City(String name, int cityID){
        this.cityID = cityID;
        this.name = name;
    }
    public City( String name, int cityID, String districtName,boolean cityHasWarehouse, boolean hasRoad, int roads){
        this(name, cityID);
        this.districtName = districtName;
        this.cityHasWarehouse = cityHasWarehouse;
        this.hasRoad = hasRoad;
        this.roads = roads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
