package LowLevelDesigns.UberSystemDesign;

public class TripMetaData {
    private Location srcLoc;
    private Location dstLoc;
    private Rating riderRating;
    private Rating driverRating;

    public TripMetaData(Location srcLoc, Location dstLoc, Rating riderRating) {
        this.srcLoc = srcLoc;
        this.dstLoc = dstLoc;
        this.riderRating = riderRating;
        this.driverRating = Rating.UNASSIGNED;
    }

    public Rating getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(Rating driverRating) {
        this.driverRating = driverRating;
    }

    public Location getSrcLoc() {
        return srcLoc;
    }

    public Location getDstLoc() {
        return dstLoc;
    }

    public Rating getRiderRating() {
        return riderRating;
    }
}
