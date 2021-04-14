package com.example.nestedrecyclerview.model;

public class ChannelModel
{
    private String channel_name ;
    private int channel_logo ;

    public ChannelModel(String channel_name, int channel_logo) {
        this.channel_name = channel_name;
        this.channel_logo = channel_logo;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public int getChannel_logo() {
        return channel_logo;
    }
}
