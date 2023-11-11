package com.mediatordesignpattern;

public interface Auction {
    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder, int amount);
}
