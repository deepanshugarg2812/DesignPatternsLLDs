package com.mediatordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Auction {
    List<Bidder> bidders = new ArrayList<>();

    @Override
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int amount) {
        for(Bidder x : bidders) {
            if (!bidder.equals(x)) {
                x.reveiveBidNotification(bidder, amount);
            }
        }
    }
}
