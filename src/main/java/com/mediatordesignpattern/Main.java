package com.mediatordesignpattern;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionMediator();
        Bidder bidder = new Bidder(auctionMediator, "Sample1");
        Bidder bidder2 = new Bidder(auctionMediator, "Sample2");
        Bidder bidder3 = new Bidder(auctionMediator, "Sample3");
        Bidder bidder4 = new Bidder(auctionMediator, "Sample4");

        bidder4.placebid(1000);
    }
}
