package DesignPatterns.BehaviouralDesignPatterns.MementoPattern;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();

        //Initiate State of the originator
        ConfigurationOriginator configurationOriginator =  new ConfigurationOriginator(5,10);

        //Take Snapshot
        ConfigurationMemento snapshot1 = configurationOriginator.createMemento();

        //Add it to history
        configurationCareTaker.addMemento(snapshot1);

        //Originator change to new state
        configurationOriginator.setHeight(7);
        configurationOriginator.setWidth(12);

        //Take Snapshot
        ConfigurationMemento snapshot2 = configurationOriginator.createMemento();

        //Add to history
        configurationCareTaker.addMemento(snapshot2);

        //Originator change to new state
        configurationOriginator.setHeight(9);
        configurationOriginator.setWidth(14);

        System.out.println(configurationOriginator);

        //UNDO
        System.out.println("UNDO...");
        ConfigurationMemento restoredMemento = configurationCareTaker.undo();
        configurationOriginator.restoreMemento(restoredMemento);
        System.out.println(configurationOriginator);

    }
}
