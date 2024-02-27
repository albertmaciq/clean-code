package com.cleancode.naming.badnaming;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle {

    private Point startingPoint;
    private int broad;
    private int high;

    public int area() {
        return broad * high;
    }

    public void endPoints() {
        int topRight = startingPoint.getCoordX() + broad;
        int bottomLeft = startingPoint.getCoordY() + high;
        System.out.println("Starting Point (X): " + startingPoint.getCoordX());
        System.out.println("Starting Point (Y): " + startingPoint.getCoordY());
        System.out.println("End Point X-Axis (Top Right): " + topRight);
        System.out.println("End Point Y-Axis (Bottom Left): " + bottomLeft);
    }
}
