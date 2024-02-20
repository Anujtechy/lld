package LowLevelDesigns.OnlineAuctionSystem;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveBidNotification(int bitAmount);
    String getName();
}
