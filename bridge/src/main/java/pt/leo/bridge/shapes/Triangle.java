package pt.leo.bridge.shapes;

import pt.leo.bridge.colours.Colour;

public class Triangle extends Shape {

    public Triangle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + colour.getName() + " triangle");
    }
}
