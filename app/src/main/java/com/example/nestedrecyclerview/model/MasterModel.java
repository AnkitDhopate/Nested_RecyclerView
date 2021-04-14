package com.example.nestedrecyclerview.model;

import java.util.ArrayList;

public class MasterModel
{
    private final static int ITEM = 0 ;
    private final static int BANNER = 1 ;
    private final static int CHANNEL = 2 ;

    // Category
    private String category_name ;
    private ArrayList<ItemModel> itemModelList ;
    // Category

    private int type ;

    // Banner
    private int banner_img;
    // Banner

    // Channel
    private ArrayList<ChannelModel> channelModelList ;
    private String channel_category_name ;
    // Channel


    // Channel
    public MasterModel(ArrayList<ChannelModel> channelModelList, String channel_category_name) {
        this.channelModelList = channelModelList;
        this.channel_category_name = channel_category_name;
        type = CHANNEL ;
    }

    public ArrayList<ChannelModel> getChannelModelList() {
        return channelModelList;
    }

    public String getChannel_category_name() {
        return channel_category_name;
    }

    // Channel

    // Category
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
    // Category

    // Banner
    public MasterModel(int banner_img) {
        this.banner_img = banner_img;
        type = BANNER ;
    }

    public int getBanner_img() {
        return banner_img;
    }
    // Banner

    public static int getITEM() {
        return ITEM;
    }

    public static int getBANNER() {
        return BANNER;
    }

    public static int getCHANNEL() {
        return CHANNEL;
    }

    public int getType() {
        return type;
    }
}
