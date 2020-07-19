package com.java;

import com.java.bridge.no.bridge.BlueSquare;
import com.java.bridge.no.bridge.RedCircle;
import com.java.bridge.no.bridge.Shape;

/**
 * Demo class for Bridge pattern where bridge pattern is not used in the implementation
 * Problem of not using Bridge Pattern:
 * This basically uses inheritance concept, which forces to create a new classes every time,
 * whenever new squares or circles are introduced
 * We can not change Color without changing Shape. Both are tightly coupled
 * If we want to introduce a new Color we must need to add a new Shape
 * Inheritance tree looks like below:
 *                   Shape
 *                |        |
 *             Circle    Square
 *           |      |    |    |
 *          Red   Blue  Red  Blue
 */
public class NoBridgeDemo {
    public static void main(String[] args) {
        Shape redCircle = new RedCircle();
        redCircle.applyColor();

        Shape blueSquare = new BlueSquare();
        blueSquare.applyColor();

    }
}
