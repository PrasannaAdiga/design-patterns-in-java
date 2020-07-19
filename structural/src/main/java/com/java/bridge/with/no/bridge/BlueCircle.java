package com.java.bridge.with.no.bridge;

//concrete class for Circle of type Blue
public class BlueCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color for a circle!");
    }
}
