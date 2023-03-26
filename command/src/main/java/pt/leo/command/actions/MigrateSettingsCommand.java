package pt.leo.command.actions;

import pt.leo.command.Product;

public class MigrateSettingsCommand implements Command {
    Product product;

    public MigrateSettingsCommand(Product product) {
        this.product = product;
    }

    @Override
    public void doIt() {
        System.out.println("Migrating settings for " + product.name);
    }

    @Override
    public void undoIt() {
        System.out.println("Reverting settings migration for " + product.name);
    }
}
