package LowLevelDesigns.UberSystemDesign;

public class Trip {

    private static int nextTripID = 1;
    private int tripId;
    private Rider rider;
    private Driver driver;
    private Location srcLoc;
    private Location dstLoc;
    private TripStatus status;
    private double price;
    private PricingStrategy pricingStrategy;
    private DriverMatchingStrategy driverMatchingStrategy;

    public Trip(Rider rider, Driver driver, Location srcLoc,
                Location dstLoc, double price,
                PricingStrategy pricingStrategy, DriverMatchingStrategy driverMatchingStrategy) {
        this.rider = rider;
        this.driver = driver;
        this.srcLoc = srcLoc;
        this.dstLoc = dstLoc;
        this.status = TripStatus.DRIVER_ON_THE_WAY;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
        this.driverMatchingStrategy = driverMatchingStrategy;
        //This is not thread safe
        this.tripId = nextTripID;
        nextTripID++;
    }

    public int getTripId() {
        return tripId;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "tripId=" + tripId +
                ", rider=" + rider.getRiderName() +
                ", driver=" + driver.getDriverName() +
                ", srcLoc=" + srcLoc.getLatitude() + "," + srcLoc.getLongitude() +
                ", dstLoc=" + dstLoc.getLatitude() + "," + dstLoc.getLongitude() +
                ", price=" + price +
                '}';
    }
}
