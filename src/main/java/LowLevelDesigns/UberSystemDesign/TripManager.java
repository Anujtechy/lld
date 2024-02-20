package LowLevelDesigns.UberSystemDesign;

import java.util.HashMap;
import java.util.Map;

public class TripManager {
    private static volatile TripManager tripManager;
    private Map<Integer, TripMetaData> tripsMetaDataInfo;
    private  Map<Integer, Trip> tripsInfo;
    private TripManager() {
        this.tripsInfo = new HashMap<>();
        this.tripsMetaDataInfo = new HashMap<>();
    }

    public static TripManager getTripMgr(){
        if(tripManager == null) {
            synchronized (TripManager.class) {
                if(tripManager == null) {
                    tripManager = new TripManager();
                }
            }
        }
        return tripManager;
    }

    public Map<Integer, Trip> getTripsInfo() {
        return tripsInfo;
    }

    public void createTrip(Rider rider, Location srcLoc, Location dstLoc) {
        TripMetaData tripMetaData = new TripMetaData(srcLoc,dstLoc,rider.getRating());

        StrategyManager strategyManager =  StrategyManager.getStrategyMgr();
        PricingStrategy pricingStrategy = strategyManager.determinePricingStrategy(tripMetaData);
        DriverMatchingStrategy driverMatchingStrategy =  strategyManager.determineDriverMatchingStrategy(tripMetaData);

        Driver driver = driverMatchingStrategy.matchDriver(tripMetaData);
        double price = pricingStrategy.calculatePrice(tripMetaData);

        Trip trip = new Trip(rider, driver, srcLoc, dstLoc,
                 price, pricingStrategy, driverMatchingStrategy);
        int tripId = trip.getTripId();

        tripsInfo.put(tripId, trip);
        tripsMetaDataInfo.put(tripId, tripMetaData);
    }
}
