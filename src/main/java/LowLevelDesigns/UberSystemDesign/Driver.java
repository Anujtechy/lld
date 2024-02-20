package LowLevelDesigns.UberSystemDesign;

public class Driver {
    private String driverName;
    private Rating rating;

    public Driver(String driverName, Rating rating) {
        this.driverName = driverName;
        this.rating = rating;
    }

    public String getDriverName() {
        return driverName;
    }

    public Rating getRating() {
        return rating;
    }
}
