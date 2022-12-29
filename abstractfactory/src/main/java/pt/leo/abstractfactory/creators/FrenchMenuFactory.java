package pt.leo.abstractfactory.creators;

import pt.leo.abstractfactory.products.dessert.Dessert;
import pt.leo.abstractfactory.products.dessert.Fritters;
import pt.leo.abstractfactory.products.dessert.Tart;
import pt.leo.abstractfactory.products.main.Duck;
import pt.leo.abstractfactory.products.main.Lamb;
import pt.leo.abstractfactory.products.main.Main;
import pt.leo.abstractfactory.products.starter.ChickenWings;
import pt.leo.abstractfactory.products.starter.MushroomSoup;
import pt.leo.abstractfactory.products.starter.Starter;

public class FrenchMenuFactory extends MenuFactory {

    @Override
    public Starter getStarter() {
        return new MushroomSoup();
    }

    @Override
    public Main getMain() {
        return new Lamb();
    }

    @Override
    public Dessert getDessert() {
        return new Tart();
    }
}
