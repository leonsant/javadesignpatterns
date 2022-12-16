package pt.leo.factory.creators;

import pt.leo.factory.products.CargoExcel;
import pt.leo.factory.products.Ship;
import pt.leo.factory.products.CargoBasic;

import java.util.HashMap;
import java.util.Map;

public class BalancedShipFactory extends ShipFactory {
    int shipsCreated = 0;
    Map<String, Integer> ids = new HashMap<>();

    public Ship createShip() {
        shipsCreated++;
        return isExcelShip() ?
                new CargoExcel(getNextId("CargoExcel"), 20, Ship.Size.XL) :
                new CargoBasic(getNextId("CargoBasic"), 10, Ship.Size.M);
    }

    private boolean isExcelShip() {
        return shipsCreated % 2 == 0;
    }

    // No command and query separation here but ... it seems so convenient :)
    private int getNextId(String CargoBasic) {
        ids.putIfAbsent(CargoBasic, 0);
        ids.put(CargoBasic, ids.get(CargoBasic) + 1);
        return ids.get(CargoBasic);
    }
}
