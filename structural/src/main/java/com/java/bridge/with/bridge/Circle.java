package com.java.bridge.with.bridge;

import com.java.bridge.with.bridge.Shape;

//class for a circle
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        this.color.applyColor();
    }
}
