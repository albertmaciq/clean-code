package com.cleancode.naming.betternaming;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle {

    private Point startingPoint;
    private int width;
    private int height;

    public int getArea() {
        return width * height;
    }

    public void printCoordinates() {
        int topRight = startingPoint.getX() + width;
        int bottomLeft = startingPoint.getY() + height;
        System.out.println("Starting Point (X): " + startingPoint.getX());
        System.out.println("Starting Point (Y): " + startingPoint.getY());
        System.out.println("End Point X-Axis (Top Right): " + topRight);
        System.out.println("End Point Y-Axis (Bottom Left): " + bottomLeft);
    }
}
