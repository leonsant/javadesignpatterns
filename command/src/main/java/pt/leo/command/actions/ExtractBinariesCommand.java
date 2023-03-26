package pt.leo.command.actions;

import pt.leo.command.Product;

public class ExtractBinariesCommand implements Command {
    Product product;

    public ExtractBinariesCommand(Product product) {
        this.product = product;
    }

    @Override
    public void doIt() {
        product.extractBinaries();
    }

    @Override
    public void undoIt() {
        product.removeBinaries();
    }
}
