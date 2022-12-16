package pt.leo.factory;

import pt.leo.factory.creators.BalancedShipFactory;
import pt.leo.factory.creators.RandomShipFactory;
import pt.leo.factory.creators.ShipFactory;
import pt.leo.factory.products.Ship;

public class Main {
    static ShipFactory shipFactory;

    public static void main(String[] args) {
        System.out.println("Results of using a randomShipFactory:");
        shipFactory = new RandomShipFactory();
        shipFactory.createShip().printHello();
        shipFactory.createShip().printHello();
        shipFactory.createShip().printHello();
        shipFactory.createShip().printHello();

        System.out.println("Results of using a balancedShipFactory:");
        shipFactory = new BalancedShipFactory();
        shipFactory.createShip().printHello();
        shipFactory.createShip().printHello();
        shipFactory.createShip().printHello();
        shipFactory.createShip().printHello();
    }
}
