package pt.leo.factory.products;

public class CargoBasic extends Ship {
    public CargoBasic(int shipId, int shield, Size size) {
        super("CargoBasic-" + shipId, shield, size);
    }

    public CargoBasic(String name, int shield, Size size) {
        super(name, shield, size);
    }
}
