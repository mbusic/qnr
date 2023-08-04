package org.example.geometry;

import org.example.misc.Colour;

public class Rectangle implements GeometricFigure {

    private double a;
    private double b;
    private Colour colour;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override public double getArea() {
        return a * b;
    }

    @Override public Colour getColour() {
        return colour;
    }
}
