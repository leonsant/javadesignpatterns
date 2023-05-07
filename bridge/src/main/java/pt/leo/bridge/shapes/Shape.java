package pt.leo.bridge.shapes;

import pt.leo.bridge.colours.Colour;

public abstract class Shape {
    final Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    public abstract void draw();
}
