package LowLevelDesigns.OnlineAuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator {
    List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        colleagues.stream()
                .filter(x -> !x.getName().equals(bidder.getName()))
                .forEach(x -> x.receiveBidNotification(bidAmount));
    }
}
