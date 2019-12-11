package Graph;
//RoadId,Group,OriginCityId,OriginCityName,Paths,AdjacencyId,AdjacencyCityName,DistanceKM,TimeHours,FuelCost,TollCost,DriverCost
public class Road {
    private int roadID;
    private char group;
    private int originCityID;
    private String originCityName;
    private int paths;
    private int adjacencyID;

    private String adjacencyCityName;
    private double distanceKM;
    private double timeHours;
    private double fuelCost;
    private double tollCost;
    private double driverCost;


    public Road (int roadID, int originCityID, int adjacencyID){
        this.roadID = roadID;
        this.originCityID = originCityID;
        this.adjacencyID = adjacencyID;
    }

    public Road (int roadID, char group, int originCityID, String originCityName, int paths, int adjacencyId, String adjacencyCityName, double distance, double timeHours, double fuelCost, double tollCost, double driverCost){
        this(roadID, originCityID, adjacencyId);
        this.group = group;
        this.originCityName = originCityName;
        this.paths = paths;
        this.adjacencyCityName = adjacencyCityName;
        this.distanceKM = distance;
        this.tollCost = tollCost;
        this.fuelCost = fuelCost;
        this.driverCost = driverCost;
        this.timeHours = timeHours;

    }

    public int getOriginCityID() {
        return originCityID;
    }

    public void setOriginCityID(int originCityID) {
        this.originCityID = originCityID;
    }

    public String getOriginCityName() {
        return originCityName;
    }

    public void setOriginCityName(String originCityName) {
        this.originCityName = originCityName;
    }

    public int getPaths() {
        return paths;
    }

    public void setPaths(int paths) {
        this.paths = paths;
    }

    public int getAdjacencyID() {
        return adjacencyID;
    }

    public void setAdjacencyID(int adjacencyID) {
        this.adjacencyID = adjacencyID;
    }

    public String getAdjacencyCityName() {
        return adjacencyCityName;
    }

    public void setAdjacencyCityName(String adjacencyCityName) {
        this.adjacencyCityName = adjacencyCityName;
    }

    public double getDistanceKM() {
        return distanceKM;
    }

    public void setDistanceKM(double distanceKM) {
        this.distanceKM = distanceKM;
    }

    public double getTimeHours() {
        return timeHours;
    }

    public void setTimeHours(double timeHours) {
        this.timeHours = timeHours;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public double getTollCost() {
        return tollCost;
    }

    public void setTollCost(double tollCost) {
        this.tollCost = tollCost;
    }

    public double getDriverCost() {
        return driverCost;
    }

    public void setDriverCost(double driverCost) {
        this.driverCost = driverCost;
    }

    public int getRoadID() {
        return roadID;
    }

    public void setRoadID(int roadID) {
        this.roadID = roadID;
    }

    public char getGroup() {
        return group;
    }

    public void setGroup(char group) {
        this.group = group;
    }
}
