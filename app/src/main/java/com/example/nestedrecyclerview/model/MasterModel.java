package com.example.nestedrecyclerview.model;

import java.util.ArrayList;

public class MasterModel
{
    private final static int ITEM = 0 ;
    private final static int BANNER = 1 ;

    private String category_name ;
    private ArrayList<ItemModel> itemModelList ;

    private int type ;

    private int banner_img;

    public MasterModel(String category_name, ArrayList<ItemModel> itemModelList) {
        this.category_name = category_name;
        this.itemModelList = itemModelList;
        type = ITEM ;
    }

    public String getCategory_name() {
        return category_name;
    }

    public ArrayList<ItemModel> getItemModelList() {
        return itemModelList;
    }

    public MasterModel(int banner_img) {
        this.banner_img = banner_img;
        type = BANNER ;
    }

    public int getBanner_img() {
        return banner_img;
    }

    public static int getITEM() {
        return ITEM;
    }

    public static int getBANNER() {
        return BANNER;
    }

    public int getType() {
        return type;
    }
}
