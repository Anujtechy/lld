package LowLevelDesigns.UberSystemDesign;

import java.util.HashMap;
import java.util.Map;

public class RiderManager {
    private static volatile RiderManager riderManager;
    private Map<String, Rider> ridersMap;
    private RiderManager() {
        ridersMap = new HashMap<>();
    }
    public static RiderManager getRiderMgr() {
        if (riderManager == null) {
            synchronized (RiderManager.class) {
                if(riderManager == null) {
                    riderManager =  new RiderManager();
                }
            }
        }
        return riderManager;
    }

    public void addRider(String riderName, Rider rider) {
        ridersMap.put(riderName, rider);
    }
    public Rider getRider(String riderName) {
        return ridersMap.getOrDefault(riderName, null);
    }

}
