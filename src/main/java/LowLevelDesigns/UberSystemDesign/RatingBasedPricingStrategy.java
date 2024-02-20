package LowLevelDesigns.UberSystemDesign;

public class RatingBasedPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(TripMetaData metaData) {
        double price = Utils.isHighRating(metaData.getRiderRating()) ? 55.0 : 65.0;
        System.out.println("Based on " + metaData.getRiderRating().name()
                + " rider rating, price of the trip is " + price);
        return price;
    }
}
