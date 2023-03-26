package pt.leo.command;

import pt.leo.command.actions.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Installer {
    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void install() {
        commands.forEach(Command::doIt);
    }

    public void remove() {
        ListIterator<Command> listIterator = commands.listIterator(commands.size());
        while (listIterator.hasPrevious()) {
            listIterator.previous().undoIt();
        }
    }
}
