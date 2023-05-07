package pt.leo.bridge.shapes;

import pt.leo.bridge.colours.Colour;

public class Square extends Shape {

    public Square(Colour colour) {
        super(colour);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + colour.getName() + " square");
    }
}
