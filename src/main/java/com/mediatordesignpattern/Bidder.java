package com.mediatordesignpattern;

public class Bidder {
    private AuctionMediator auctionMediator;
    private String name;

    public Bidder(AuctionMediator auctionMediator, String name) {
        this.auctionMediator = auctionMediator;
        this.auctionMediator.addBidder(this);
        this.name = name;
    }

    public AuctionMediator getAuctionMediator() {
        return auctionMediator;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Bidder bidder = (Bidder) obj;
        return bidder.getName().equals(this.name);
    }

    public void reveiveBidNotification(Bidder bidder, int amount){
        System.out.println("" + bidder.getName() + "placed bid for " + amount);
    }

    public void placebid(int amount){
        auctionMediator.placeBid(this, amount);
    }
}
