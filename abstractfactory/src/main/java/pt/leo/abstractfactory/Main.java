package pt.leo.abstractfactory;

import pt.leo.abstractfactory.creators.ChineseMenuFactory;
import pt.leo.abstractfactory.creators.FrenchMenuFactory;
import pt.leo.abstractfactory.creators.IndianMenuFactory;
import pt.leo.abstractfactory.creators.MenuFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi! I'm a Chinese customer and I am going to order the Chinese Menu! I'm eating:");
        MenuFactory mf = new ChineseMenuFactory();
        System.out.println("Starter: " + mf.getStarter().getDescription());
        System.out.println("Main: " + mf.getMain().getDescription());
        System.out.println("Dessert: " + mf.getDessert().getDescription());
        System.out.println();
        System.out.println("Hi! I'm a French customer and I am going to order the French Menu! I'm eating:");
        mf = new FrenchMenuFactory();
        System.out.println("Starter: " + mf.getStarter().getDescription());
        System.out.println("Main: " + mf.getMain().getDescription());
        System.out.println("Dessert: " + mf.getDessert().getDescription());
        System.out.println();
        System.out.println("Hi! I'm an Indian customer and I am going to order the Indian Menu! I'm eating:");
        mf = new IndianMenuFactory();
        System.out.println("Starter: " + mf.getStarter().getDescription());
        System.out.println("Main: " + mf.getMain().getDescription());
        System.out.println("Dessert: " + mf.getDessert().getDescription());
    }
}
