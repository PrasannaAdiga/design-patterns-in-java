package com.java;

import com.java.bridge.with.bridge.*;

/**
 * Demo class for Bridge pattern where bridge pattern is used in the implementation
 * This implementation favours Composition over Inheritance
 * We can introduce a new Color or new Shape without effecting each other
 * So both Color and Shape are loosely coupled to each other
 * Composition tree looks like below:
 *                     Shape                 Color
 *                |            |          |         |
 *             Circle        Square      Red       Blue
 *          |  (Has)  |    | (Has) |
 *         Red      Blue  Red    Blue
 *        Color    Color Color  Color
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Color redColor = new RedColor();
        Color blueColor = new BlueColor();

        Shape redCircle = new Circle(redColor);
        Shape blueCircle = new Circle(blueColor);
        redCircle.applyColor();
        blueCircle.applyColor();

        Shape redSquare = new Square(redColor);
        Shape blueSquare = new Square(blueColor);
        redSquare.applyColor();
        blueSquare.applyColor();

        /**
         * NOTE: To create a new shape with new colour,
         * we can create a new Color and new Shape independently without effecting each other
         * and apply that new Color to new Shape easily.
         * Bridge pattern will allows to change things at one end of a bridge independently,
         * without needs for any changes on the other end of a bridge
         */
    }
}
