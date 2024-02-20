package LowLevelDesigns.UberSystemDesign;

public class Uber {
    public static void main(String[] args) {

        //Creating riders
        Rider kreetiRider = new Rider("Keerti", Rating.TWO_STARS);
        Rider gauravRider = new Rider("Gaurav", Rating.FIVE_STARS);
        RiderManager riderManager = RiderManager.getRiderMgr();
        riderManager.addRider(kreetiRider.getRiderName(), kreetiRider);
        riderManager.addRider(gauravRider.getRiderName(), gauravRider);

        //Creating drivers
        Driver yogitaDriver = new Driver("Yogita", Rating.THREE_STARS);
        Driver riddhiDriver =  new Driver("Riddhi", Rating.FOUR_STARS);
        DriverManager driverManager = DriverManager.getDriverMgr();
        driverManager.addDriver(yogitaDriver.getDriverName(), yogitaDriver);
        driverManager.addDriver(riddhiDriver.getDriverName(), riddhiDriver);

        //Create Trips
        TripManager tripManager = TripManager.getTripMgr();

        System.out.println("Creating Trip for Keerti from location (10,10) to (30,30)");
        tripManager.createTrip(kreetiRider, new Location(10,10), new Location(30,30));

        System.out.println();
        System.out.println("Creating Trip for Gaurav from location (200,200) to (500,500)");
        tripManager.createTrip(gauravRider, new Location(200,200), new Location(500,500));

        //Display all the trips created
        System.out.println();
        tripManager.getTripsInfo()
                .values()
                .forEach(System.out::println);

    }
}
