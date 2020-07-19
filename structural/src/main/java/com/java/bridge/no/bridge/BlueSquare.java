package com.java.bridge.no.bridge;

//concrete class for Square of type Blue
public class BlueSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color for a square!");
    }
}
