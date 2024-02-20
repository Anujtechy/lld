package DesignPatterns.BehaviouralDesignPatterns.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleInstance(VehicleType.BIKE);
        printVehicleDetails(vehicle);
    }
    private static void printVehicleDetails(Vehicle vehicle) {
        //if(vehicle != null)
        {
            System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
            System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
        }
    }
}
