package com.example.nestedrecyclerview.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nestedrecyclerview.R;
import com.example.nestedrecyclerview.model.ItemModel;
import com.example.nestedrecyclerview.model.MasterModel;

import java.util.ArrayList;

public class MasterAdapter extends RecyclerView.Adapter
{
    private ArrayList<MasterModel> masterModelList ;
    private Context context ;

    public MasterAdapter(ArrayList<MasterModel> masterModelList, Context context) {
        this.masterModelList = masterModelList;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        switch (masterModelList.get(position).getType())
        {
            case 0 :
                return MasterModel.getITEM();
            case 1 :
                return MasterModel.getBANNER();
            default:
                return -1 ;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType)
        {
            case 0 :
                View item_view = LayoutInflater.from(context).inflate(R.layout.master_layout, parent, false);
                return new MasterViewHolder(item_view);
            case 1 :
                View banner_view = LayoutInflater.from(context).inflate(R.layout.banner_layout, parent, false);
                return new BannerViewHolder(banner_view);
            default:
                return null ;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (masterModelList.get(position).getType())
        {
            case 0:
                ((MasterViewHolder)holder).category_name.setText(masterModelList.get(position).getCategory_name());
                ((MasterViewHolder)holder).setRecyclerView(masterModelList.get(position).getItemModelList(), context);
                break;
            case 1:
                ((BannerViewHolder)holder).banner_img.setImageResource(masterModelList.get(position).getBanner_img());
                break;
            default:
                return;
        }
    }

    @Override
    public int getItemCount() {
        return masterModelList.size();
    }

    public class BannerViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView banner_img ;
        public BannerViewHolder(@NonNull View itemView) {
            super(itemView);
            banner_img = itemView.findViewById(R.id.banner_img);
        }
    }

    public class MasterViewHolder extends RecyclerView.ViewHolder
    {
        private TextView category_name;
        private RecyclerView items_recycler_view;

        public MasterViewHolder(@NonNull View itemView) {
            super(itemView);
            category_name = itemView.findViewById(R.id.category_name);
            items_recycler_view = itemView.findViewById(R.id.items_recycler_view);
        }

        public void setRecyclerView(ArrayList<ItemModel> itemModelList, Context context)
        {
            RecyclerView itemRecyclerView = itemView.findViewById(R.id.items_recycler_view);
            itemRecyclerView.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
            itemRecyclerView.setLayoutManager(linearLayoutManager);

            ItemsAdapter itemsAdapter = new ItemsAdapter(itemModelList, context);
            itemRecyclerView.setAdapter(itemsAdapter);
        }
    }
/*
    public void setItemRecyclerView(RecyclerView itemRecyclerView, ArrayList<ItemModel> itemModelList, Context context)
    {
        itemRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        itemRecyclerView.setLayoutManager(linearLayoutManager);

        ItemsAdapter itemsAdapter = new ItemsAdapter(itemModelList, context);
        itemRecyclerView.setAdapter(itemsAdapter);
    }
 */
}
