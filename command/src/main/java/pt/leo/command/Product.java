package pt.leo.command;

public class Product {
    public String name;

    public Product(String name) {
        this.name = name;
    }

    public void extractBinaries() {
        System.out.println("Extracting binaries for " + name);
    }

    public void removeBinaries() {
        System.out.println("Removing binaries for " + name);
    }
}
