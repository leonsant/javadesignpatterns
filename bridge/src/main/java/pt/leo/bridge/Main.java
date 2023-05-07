package pt.leo.bridge;

import pt.leo.bridge.colours.*;
import pt.leo.bridge.shapes.*;

public class Main {
    public static void main(String[] args) {
        Colour colour = new Green();
        Shape shape = new Circle(colour);
        shape.draw();

        colour = new Red();
        shape = new Triangle(colour);
        shape.draw();

        colour = new Blue();
        shape = new Square(colour);
        shape.draw();
    }
}
