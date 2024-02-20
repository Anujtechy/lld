package LowLevelDesigns.UberSystemDesign;

public class StrategyManager {
    private static volatile StrategyManager strategyManager;
    private StrategyManager() {}
    public static StrategyManager getStrategyMgr() {
        if(strategyManager == null) {
            synchronized (StrategyManager.class) {
                if(strategyManager == null) {
                    strategyManager = new StrategyManager();
                }
            }
        }
        return strategyManager;
    }

    public PricingStrategy determinePricingStrategy(TripMetaData metaData){
        System.out.println("Based on location and other factors, setting pricing strategy");
        return new RatingBasedPricingStrategy();
    }

    public DriverMatchingStrategy determineDriverMatchingStrategy(TripMetaData metaData){
        System.out.println("Based on location and other factors, setting driver matching strategy");
        return new LeastTimeBasedMatchingStrategy();
    }
}
