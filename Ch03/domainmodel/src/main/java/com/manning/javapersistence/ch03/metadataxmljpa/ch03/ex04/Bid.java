package com.manning.javapersistence.ch03.metadataxmljpa.ch03.ex04;

public class Bid {

    private Item item;

    public Bid(){
    }

    public Bid(Item item){
        this.item = item;
        item.bids.add(this);
    }

    public Item getItem(){return item;}
}
