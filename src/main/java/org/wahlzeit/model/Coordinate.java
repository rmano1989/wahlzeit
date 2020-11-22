package org.wahlzeit.model;
import java.util.Objects;

public class Coordinate {
    //Attributes
    private final double x;
    private final double y;
    private final double z;

    //Constructor
    public Coordinate (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //getters
    public double getX (){
        return x;
    }
    public double getY (){
        return y;
    }
    public double getZ(){
        return z;
    }

    //Method direct cartesian distance
    public double getDistance(Coordinate newCoordinate){
        double distance = Math.sqrt(Math.pow((this.x-newCoordinate.x), 2) + Math.pow((this.y-newCoordinate.y), 2) + Math.pow((this.z-newCoordinate.z), 2));
        return distance;
    }

    //Method equal coordinates
    public boolean isEqual(Coordinate equalCoordinate){
        double delta = 0.001;
        boolean EqX;
        boolean EqY;
        boolean EqZ;

        if(Math.abs(equalCoordinate.x - this.x) < delta){
            EqX = true;
        }
        else{
             EqX =  false;
        };

        if(Math.abs(equalCoordinate.y - this.y) < delta){
             EqY = true;
        }
        else{
             EqY =  false;
        };
        if(Math.abs(equalCoordinate.z - this.z) < delta){
             EqZ = true;
        }
        else{
             EqZ =  false;
        };
        return EqX && EqY && EqZ;
    }

    //Überschreiben von equals
    @Override
    public boolean equals(Object other){
        if (other == null){
            return false;
        }
        if (other instanceof Coordinate){
            boolean equality = isEqual((Coordinate) other);
            return equality;
        }
        else {
            return false;
        }
    }
    //Überschreiben von hashCode wg. Überschreiben von equals
    @Override
    public int hashCode(){
        return Objects.hash(x,y,z);
    }
}
