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
import com.example.nestedrecyclerview.model.ItemModel;

import java.util.ArrayList;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>
{
    private ArrayList<ItemModel> itemModelList ;
    private Context context;

    public ItemsAdapter(ArrayList<ItemModel> itemModelList, Context context) {
        this.itemModelList = itemModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position)
    {
        holder.item_img.setImageResource(itemModelList.get(position).getItem_image());
        holder.item_name.setText(itemModelList.get(position).getItem_name());
    }

    @Override
    public int getItemCount() {
        return itemModelList.size();
    }

    public class ItemsViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView item_img ;
        private TextView item_name ;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);

            item_img = itemView.findViewById(R.id.item_img);
            item_name = itemView.findViewById(R.id.item_name);

        }
    }
}
