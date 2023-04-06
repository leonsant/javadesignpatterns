package pt.leo.facade;

import java.util.ArrayList;
import java.util.List;

public class ProductInstaller {
    public void install() {
        Product product = new Product("MyCoolTextEditor");
        ProductConfiguration productConfiguration = new ProductConfiguration();
        prepareInstallation(product, productConfiguration);
    }

    private void prepareInstallation(Product product, ProductConfiguration productConfiguration) {
        List<Requirement> requirementList = new ArrayList<>();
        requirementList.add(new Requirement("Storage Requirements"));
        requirementList.add(new Requirement("Memory Requirements"));
        requirementList.add(new Requirement("Permissions"));
        if (checkRequirements(product, requirementList)) {
            OperatingSystem operatingSystem = new OperatingSystem();
            operatingSystem.update();
        }
        installProduct(product);
    }

    private void installProduct(Product product) {
        System.out.println("Installing " + product.name + "...");
        System.out.println("Product installed!");
    }

    private boolean checkRequirements(Product product, List<Requirement> requirementList) {
        System.out.println("Checking requirements...");
        requirementList.forEach(r -> System.out.println("Checking: " + r.name));
        return true;
    }
}
