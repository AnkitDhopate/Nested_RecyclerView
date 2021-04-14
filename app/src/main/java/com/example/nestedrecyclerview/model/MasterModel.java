package com.example.nestedrecyclerview.model;

import java.util.ArrayList;

public class MasterModel
{
    private String category_name ;
    private ArrayList<ItemModel> itemModelList ;

    public MasterModel(String category_name, ArrayList<ItemModel> itemModelList) {
        this.category_name = category_name;
        this.itemModelList = itemModelList;
    }

    public String getCategory_name() {
        return category_name;
    }

    public ArrayList<ItemModel> getItemModelList() {
        return itemModelList;
    }
}
