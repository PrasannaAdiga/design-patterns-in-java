package com.java.bridge.with.bridge;

//class contains contract for a shape
public abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
