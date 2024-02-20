package DesignPatterns.BehaviouralDesignPatterns.NullObjectDesignPattern;

public class VehicleFactory {
    public static Vehicle getVehicleInstance(VehicleType type) {
        switch (type) {
            case CAR:
                return new Car();
            default:
                return new NullVehicle();
        }
    }
}
