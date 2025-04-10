package design_patterns.behavioral.exercise;

import java.util.LinkedList;

public class RemoteControl {
    private Command curretCommand;
    private LinkedList<Command> history = new LinkedList<Command>();

    public void setCommand(Command command) {
        this.curretCommand = command;
    }

    public void pressButton() {
        this.curretCommand.execute();
        this.history.addLast(curretCommand);
    }

    public void pressUndo() {
        if (history != null) {
            Command lastCommand = this.history.getLast();
            lastCommand.undo();
        }
        else System.out.println("NO COMMANDS to undo");
    }
}
