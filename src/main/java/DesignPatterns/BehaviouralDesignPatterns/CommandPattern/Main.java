package DesignPatterns.BehaviouralDesignPatterns.CommandPattern;

public class Main {
    public static void main(String[] args) {
//        AirConditioner ac = new AirConditioner();
//        ac.turnOnAC();
//        ac.setTemperature(24);
//        ac.turnOffAC();
//
//        System.out.println();
//
//        Bulb bulb = new Bulb();
//        bulb.turnOnBulb();
//        bulb.turnOffBulb();

        AirConditioner ac = new AirConditioner();
        MyRemoteControl remote = new MyRemoteControl();
        remote.setCommand(new TurnACOnCommand(ac));

        remote.pressButton();
        remote.undo();
    }
}
