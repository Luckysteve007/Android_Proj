package com.example.thegroceryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder> {
    private List<Item> itemList;

    public ItemClickListner itemClickListner;
    public void setClickListner(ItemClickListner myListner){
        this.itemClickListner=myListner;
    }


    public MyAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_layout,
                parent,
                false
        );
        return new myViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Item item=itemList.get(position);
        holder.Title.setText(item.ItemName);
        holder.Description.setText(item.ItemDescription);
        holder.Img.setImageResource(item.ItemImage);
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView Title;
        TextView Description;
        ImageView Img;

        public myViewHolder(@NonNull View itemView)  {

            super(itemView);
            Title=itemView.findViewById(R.id.titleText);
            Description=itemView.findViewById(R.id.descriptionText);
            Img=itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(itemClickListner!=null){
                itemClickListner.onClick(v,getAdapterPosition());
            }
        }
    }
}
