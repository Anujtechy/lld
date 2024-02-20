package LowLevelDesigns.UberSystemDesign;

public class Rider {
    private String riderName;
    private Rating rating;

    public Rider(String riderName, Rating rating) {
        this.riderName = riderName;
        this.rating = rating;
    }

    public String getRiderName() {
        return riderName;
    }

    public Rating getRating() {
        return rating;
    }
}
