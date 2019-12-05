package Graph;

import java.util.ArrayList;

public class Route {
    private int originCity;
    private int destinationCity;
    private ArrayList<Road> path;
    private double length;

    public Route(int originCity, int destinationCity){
        this.originCity = originCity;
        this.destinationCity = destinationCity;
    }
    public Route(int originCity, int destinationCity, double length){
        this(originCity,destinationCity);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public ArrayList<Road> getPath() {
        return path;
    }

    public int getOriginCity() {
        return originCity;
    }

    public int getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(int destinationCity) {
        this.destinationCity = destinationCity;
    }

    public void setOriginCity(int originCity) {
        this.originCity = originCity;
    }
}
