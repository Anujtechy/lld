package LowLevelDesigns.UberSystemDesign;

public class LeastTimeBasedMatchingStrategy implements DriverMatchingStrategy {
    @Override
    public Driver matchDriver(TripMetaData metaData) {
        DriverManager driverManager = DriverManager.getDriverMgr();
        if(driverManager.getDriversMap().isEmpty()){
            System.out.println("No drivers! What Service is this huh?");
        }
        System.out.println("Using quadtree to see nearest cabs, using driver manager to get details of driver and send notifications");
        Driver driver = driverManager.getDriversMap().values().stream().findFirst().orElse(null);
        System.out.println("Setting " +  driver.getDriverName() + " as driver");
        return driver;
    }
}
