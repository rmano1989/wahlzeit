package org.wahlzeit.model;

public class Location {

    //Attribute
    private Coordinate coordinate;

    //Constructor
    public Location (Coordinate coordinate){
        this.coordinate = coordinate;
    }

    //getter
    public Coordinate getCoordinate(){
        return this.coordinate;
    }

    //setter
    public void setCoordinate(Coordinate coordinate){
        if (coordinate == null){
            throw new IllegalArgumentException("es muss mind. 1 Koordinate vorhanden sein");
        }
        this.coordinate = coordinate;
    }
}
