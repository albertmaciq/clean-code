package com.cleancode.naming.badnaming;

public class BadNamingExample {

    public static void main(String[] args) {
        Rectangle myRect = buildStuff();
        System.out.println(myRect.area());
        myRect.endPoints();
    }

    public static Rectangle buildStuff() {
        Point mainPoint = new Point(50, 100);
        Rectangle rect = new Rectangle(mainPoint, 90, 10);
        return rect;
    }
}
