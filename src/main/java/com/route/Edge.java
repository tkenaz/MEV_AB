package main.java.com.route;

public class Edge {

    City source;
    City destination;
    double distance;

    Edge(City source, City destination, double distance) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

}
