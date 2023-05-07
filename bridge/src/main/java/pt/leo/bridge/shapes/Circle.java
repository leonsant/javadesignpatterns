package pt.leo.bridge.shapes;

import pt.leo.bridge.colours.Colour;

public class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + colour.getName() + " circle");
    }
}
