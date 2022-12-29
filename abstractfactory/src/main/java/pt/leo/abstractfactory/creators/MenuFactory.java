package pt.leo.abstractfactory.creators;

import pt.leo.abstractfactory.products.dessert.Dessert;
import pt.leo.abstractfactory.products.main.Main;
import pt.leo.abstractfactory.products.starter.Starter;

public abstract class MenuFactory {
    public abstract Starter getStarter();
    public abstract Main getMain();
    public abstract Dessert getDessert();
}
