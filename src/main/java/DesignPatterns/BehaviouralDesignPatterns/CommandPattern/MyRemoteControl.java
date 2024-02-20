package DesignPatterns.BehaviouralDesignPatterns.CommandPattern;

import java.util.Stack;

//Invoker
public class MyRemoteControl {

    private Stack<ICommand> history = new Stack<>();
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }
    public void pressButton() {
        command.execute();
        history.add(command);
    }
    public void undo(){
        if(!history.isEmpty()) {
            ICommand lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}
