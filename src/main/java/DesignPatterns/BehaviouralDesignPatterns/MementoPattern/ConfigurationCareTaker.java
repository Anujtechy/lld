package DesignPatterns.BehaviouralDesignPatterns.MementoPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ConfigurationCareTaker {
    Stack<ConfigurationMemento> history =  new Stack<>();

    public void addMemento(ConfigurationMemento memento) {
        history.push(memento);
    }

    public ConfigurationMemento undo() {
        if(!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
