package com.java.bridge.with.bridge;

//class for a square
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
