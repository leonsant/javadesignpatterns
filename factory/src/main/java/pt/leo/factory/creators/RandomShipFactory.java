package pt.leo.factory.creators;

import pt.leo.factory.products.CargoExcel;
import pt.leo.factory.products.Ship;
import pt.leo.factory.products.CargoBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomShipFactory extends ShipFactory {
    public static final int MIN_SHIELD = 1;
    public static final int EXCEL_BOOST = 2;
    public static final int SHIELD_MULTIPLIER = 5;

    Map<String, Integer> ids = new HashMap<>();
    Random random = new Random(System.nanoTime());

    public Ship createShip() {
        return isExcelShip() ? createCargoExcel() : createCargoBasic();
    }

    private boolean isExcelShip() {
        return random.nextInt(EXCEL_BOOST) == 0;
    }

    private CargoBasic createCargoBasic() {
        return new CargoBasic(getNextId("CargoBasic"), getCargoBasicShield(), getCargoBasicSize());
    }

    private CargoExcel createCargoExcel() {
        return new CargoExcel(getNextId("CargoExcel"), getCargoExcelShield(), getCargoExcelSize());
    }

    // No command and query separation here but ... it seems so convenient :)
    private int getNextId(String CargoBasic) {
        ids.putIfAbsent(CargoBasic, 0);
        ids.put(CargoBasic, ids.get(CargoBasic) + 1);
        return ids.get(CargoBasic);
    }

    private int getCargoBasicShield() {
        return (MIN_SHIELD + getZeroOrOne()) * SHIELD_MULTIPLIER;
    }

    private int getCargoExcelShield() {
        return (MIN_SHIELD + getZeroOrOne() + EXCEL_BOOST) * SHIELD_MULTIPLIER;
    }

    private Ship.Size getCargoBasicSize() {
        return Ship.Size.valueOf(getZeroOrOne());
    }

    private Ship.Size getCargoExcelSize() {
        return Ship.Size.valueOf(EXCEL_BOOST + getZeroOrOne());
    }

    private int getZeroOrOne() {
        return random.nextInt(2);
    }
}
