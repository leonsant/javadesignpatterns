package pt.leo.command.actions;

import pt.leo.command.Product;

public class InstallDbSchemaCommand implements Command {
    Product product;

    public InstallDbSchemaCommand(Product product) {
        this.product = product;
    }

    @Override
    public void doIt() {
        System.out.println("Installing DB schema for " + product.name);
    }

    @Override
    public void undoIt() {
        System.out.println("Rolling DB schema changes back for " + product.name);
    }
}
