package org.wahlzeit.model;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoordinateTest {

    @Test
    public void distanceTest(){
        Coordinate myCoordinate = new Coordinate (0,0,0);
        Coordinate yourCoordinate = new Coordinate (4,4,4);
        double realDistance = myCoordinate.getDistance(yourCoordinate);
        double expectedDistance = Math.sqrt(48);
        System.out.println(realDistance);
        System.out.println(expectedDistance);
        assertEquals(expectedDistance, realDistance, 0.1);
    }

    @Test
    public void equalityTrue (){
        Coordinate myCoordinate = new Coordinate (4,4,4);
        Coordinate yourCoordinate = new Coordinate (4,4,4);
        assertEquals(myCoordinate, yourCoordinate);
    }

    @Test
    public void equalityFalse (){
        Coordinate myCoordinate = new Coordinate (0,0,0);
        Coordinate yourCoordinate = new Coordinate (4,4,4);
        assertNotEquals(myCoordinate, yourCoordinate);
    }
}