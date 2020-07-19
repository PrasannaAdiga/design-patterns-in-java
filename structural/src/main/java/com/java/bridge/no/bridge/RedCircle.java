package com.java.bridge.no.bridge;

//concrete class for Circle of type Red
public class RedCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Applying red color for a circle!");
    }
}
