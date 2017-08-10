package com.oop;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LineTest {

    @Test
    public void testLineLength()  {
        Coordinate point1 = new Coordinate(1,1);
        Coordinate point2 = new Coordinate(2,2);
        assertEquals(Math.pow(2,.5), new Line(point1,point2).getLength());


        point1 = new Coordinate(0,0);
        point2 = new Coordinate(2,0);
        assertEquals(2.0, new Line(point1,point2).getLength());


        point1 = new Coordinate(0,3);
        point2 = new Coordinate(4,0);
        assertEquals(5.0, new Line(point1,point2).getLength());
    }
}
