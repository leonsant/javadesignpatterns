package pt.leo.factory.products;

import java.util.HashMap;
import java.util.Map;

public class Ship {
    protected String name;
    protected int shield;
    protected Size size;

    public Ship(int shipId, int shield, Size size) {
        new Ship("NamelessShip-" + shipId, shield, size);
    }

    public Ship(String name, int shield, Size size) {
        this.name = name;
        this.shield = shield;
        this.size = size;
    }

    public enum Size {
        M(0),
        L(1),
        XL(2),
        XXL(3);

        public final int value;
        private final static Map<Integer, Size> map = new HashMap<>();

        Size(int value) {
            this.value = value;
        }

        static {
            for (Size size : Size.values()) {
                map.put(size.value, size);
            }
        }

        public static Size valueOf(int size) {
            return map.get(size);
        }
    }

    public void printHello() {
        System.out.println("Hello from " + this.name + "! I am a " + this.size + "-size " + this.getClass().getSimpleName() + " ship with " + this.shield + "-power shield");
    }
}
