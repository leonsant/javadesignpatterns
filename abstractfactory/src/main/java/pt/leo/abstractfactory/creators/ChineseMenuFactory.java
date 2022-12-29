package pt.leo.abstractfactory.creators;

import pt.leo.abstractfactory.products.dessert.Dessert;
import pt.leo.abstractfactory.products.dessert.Fritters;
import pt.leo.abstractfactory.products.main.Duck;
import pt.leo.abstractfactory.products.main.Main;
import pt.leo.abstractfactory.products.starter.ChickenWings;
import pt.leo.abstractfactory.products.starter.Starter;

public class ChineseMenuFactory extends MenuFactory {

    @Override
    public Starter getStarter() {
        return new ChickenWings();
    }

    @Override
    public Main getMain() {
        return new Duck();
    }

    @Override
    public Dessert getDessert() {
        return new Fritters();
    }
}
