package com.example.nestedrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.master_layout, parent, false);
        return new MasterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MasterViewHolder)holder).category_name.setText(masterModelList.get(position).getCategory_name());
        setItemRecyclerView(((MasterViewHolder)holder).items_recycler_view, masterModelList.get(position).getItemModelList(), context);
    }

    @Override
    public int getItemCount() {
        return masterModelList.size();
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
    }

    public void setItemRecyclerView(RecyclerView itemRecyclerView, ArrayList<ItemModel> itemModelList, Context context)
    {
        itemRecyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        itemRecyclerView.setLayoutManager(linearLayoutManager);

        ItemsAdapter itemsAdapter = new ItemsAdapter(itemModelList, context);
        itemRecyclerView.setAdapter(itemsAdapter);
    }
}
