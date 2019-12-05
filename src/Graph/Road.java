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

    public String getOriginCityName() {
        return originCityName;
    }
}
