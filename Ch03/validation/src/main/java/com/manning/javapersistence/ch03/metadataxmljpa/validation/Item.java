package com.manning.javapersistence.ch03.metadataxmljpa.validation;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Item {

    @NotNull
    @Size(min=2,max=255,message = "Name is required.maximum 255 characters.")
    private String name;

    @Future
    private Date auctionEnd;

    public String getName(){ return name;}

    public void setName(String name){this.name = name;}

    public Date getAuctionEnd(){return auctionEnd;}

    public void setAuctionEnd(Date auctionEnd) {this.auctionEnd = auctionEnd;}
}
