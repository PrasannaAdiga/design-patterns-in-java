package com.java.bridge.with.no.bridge;

//concrete class for Square of type Red
public class RedSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying red color for a square!");
    }
}
