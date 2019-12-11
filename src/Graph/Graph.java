package Graph;

import java.util.*;

public class Graph<City> {

    private HashSet<City> nodes;

    public Graph(ArrayList<City> nodes) {
        this.nodes = new HashSet<City>(nodes);
    }
}
