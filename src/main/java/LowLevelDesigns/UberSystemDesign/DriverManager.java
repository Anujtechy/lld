package LowLevelDesigns.UberSystemDesign;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {
    private static volatile DriverManager driverManager;
    private Map<String, Driver> driversMap;
    private DriverManager() {
        driversMap = new HashMap<>();
    }
    public static DriverManager getDriverMgr() {
        if (driverManager == null) {
            synchronized (DriverManager.class) {
                if(driverManager == null) {
                    driverManager =  new DriverManager();
                }
            }
        }
        return driverManager;
    }

    public Map<String, Driver> getDriversMap() {
        return driversMap;
    }

    public void addDriver(String driverName, Driver driver) {
        driversMap.put(driverName, driver);
    }
    public Driver getRider(String riderName) {
        return driversMap.getOrDefault(driversMap, null);
    }
}
