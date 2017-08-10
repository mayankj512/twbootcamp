package com.oop;

public class Line {

    private double length;

    private Coordinate startPoint;
    private Coordinate endPoint;

    public Line(Coordinate startPoint, Coordinate endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.length = getLength();
    }

    public double getLength() {
        double x = Math.pow((endPoint.getX() - startPoint.getX()), 2);
        double y = Math.pow((endPoint.getY() - startPoint.getY()), 2);
        double length = Math.sqrt(x+y);
        return length;
    }
}
