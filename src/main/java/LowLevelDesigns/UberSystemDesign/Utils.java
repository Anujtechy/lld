package LowLevelDesigns.UberSystemDesign;

public class Utils {
    public static boolean isHighRating(Rating rating) {
        return rating == Rating.FOUR_STARS || rating == Rating.FIVE_STARS;
    }
}
