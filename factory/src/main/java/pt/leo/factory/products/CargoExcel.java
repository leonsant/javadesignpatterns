package pt.leo.factory.products;

public class CargoExcel extends Ship {
    public CargoExcel(int shipId, int shield, Size size) {
        super("CargoExcel-" + shipId, shield, size);
    }

    public CargoExcel(String name, int shield, Size size) {
        super(name, shield, size);
    }
}
