package com.example.nestedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerview.R;
import com.example.nestedrecyclerview.model.ChannelModel;

import java.util.ArrayList;

public class ChannelAdapter extends RecyclerView.Adapter<ChannelAdapter.ChannelViewHolder>
{
    private ArrayList<ChannelModel> channelModelList ;
    private Context context ;

    public ChannelAdapter(ArrayList<ChannelModel> channelModelList, Context context) {
        this.channelModelList = channelModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChannelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.channel_layout, parent, false);
        return new ChannelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChannelViewHolder holder, int position) {
        holder.channel_name.setText(channelModelList.get(position).getChannel_name());
        holder.channel_logo.setImageResource(channelModelList.get(position).getChannel_logo());
    }

    @Override
    public int getItemCount() {
        return channelModelList.size();
    }

    public class ChannelViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView channel_logo ;
        private TextView channel_name ;

        public ChannelViewHolder(@NonNull View itemView) {
            super(itemView);
            channel_logo = itemView.findViewById(R.id.channel_logo);
            channel_name = itemView.findViewById(R.id.channel_name);
        }
    }
}
