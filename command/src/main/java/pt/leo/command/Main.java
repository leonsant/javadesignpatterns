package pt.leo.command;

import pt.leo.command.actions.ExtractBinariesCommand;
import pt.leo.command.actions.InstallDbSchemaCommand;
import pt.leo.command.actions.MigrateSettingsCommand;

public class Main {
    public static void main(String[] args) {
        Installer installer = new Installer();
        Product product = new Product("MyProduct");
        installer.addCommand(new ExtractBinariesCommand(product));
        installer.addCommand(new InstallDbSchemaCommand(product));
        installer.addCommand(new MigrateSettingsCommand(product));
        installer.install();
        installer.remove();
    }
}
