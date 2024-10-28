package com.example.thegroceryapp;

public class Item {
    int ItemImage;
    String ItemName;
    String ItemDescription;

    //constructor
    public Item(int itemImage, String itemName, String itemDescription) {
        ItemImage = itemImage;
        ItemName = itemName;
        ItemDescription = itemDescription;
    }
    //Getter and setter

    public int getItemImage() {
        return ItemImage;
    }

    public void setItemImage(int itemImage) {
        ItemImage = itemImage;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String itemDescription) {
        ItemDescription = itemDescription;
    }
}
