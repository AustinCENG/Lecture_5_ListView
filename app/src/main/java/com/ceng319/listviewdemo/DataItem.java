package com.ceng319.listviewdemo;

// TODO 1: Needs a data holder for your List Items. This is the element of the data unit. Finished
// Define a data class that would have the following items:
/*private String itemId;
private String itemName;
private String flagimage;*/

// This is a holder of the data that would be used for your app.
public class DataItem {

    private int itemId;
    private String itemName;
    private String flagimage;

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    private String population;

    public DataItem(int itemId, String itemName, String flagimage, String population) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.flagimage = flagimage;
        this.population = population;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getFlagimage() {
        return flagimage;
    }

    public void setFlagimage(String flagimage) {
        this.flagimage = flagimage;
    }

}
