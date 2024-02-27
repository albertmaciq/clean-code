package com.cleancode.naming.betternaming;

public class BetterNamingExample {

    public static void main(String[] args) {
        Rectangle rectangle = buildRectangle();
        System.out.println(rectangle.getArea());
        rectangle.printCoordinates();
    }

    public static Rectangle buildRectangle() {
        Point startingRectanglePoint = new Point(50, 100);
        return new Rectangle(startingRectanglePoint, 90, 10);
    }
}
