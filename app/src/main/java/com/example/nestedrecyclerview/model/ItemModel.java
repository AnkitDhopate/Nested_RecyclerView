package com.example.nestedrecyclerview.model;

public class ItemModel
{
    private int item_image ;
    private String item_name ;

    public ItemModel(int item_image, String item_name) {
        this.item_image = item_image;
        this.item_name = item_name;
    }

    public int getItem_image() {
        return item_image;
    }

    public String getItem_name() {
        return item_name;
    }
}
