package pt.leo.abstractfactory.creators;

import pt.leo.abstractfactory.products.dessert.Cake;
import pt.leo.abstractfactory.products.dessert.Dessert;
import pt.leo.abstractfactory.products.dessert.Fritters;
import pt.leo.abstractfactory.products.main.Chicken;
import pt.leo.abstractfactory.products.main.Duck;
import pt.leo.abstractfactory.products.main.Main;
import pt.leo.abstractfactory.products.starter.ChickenWings;
import pt.leo.abstractfactory.products.starter.Mushrooms;
import pt.leo.abstractfactory.products.starter.Starter;

public class IndianMenuFactory extends MenuFactory {

    @Override
    public Starter getStarter() {
        return new Mushrooms();
    }

    @Override
    public Main getMain() {
        return new Chicken();
    }

    @Override
    public Dessert getDessert() {
        return new Cake();
    }
}
