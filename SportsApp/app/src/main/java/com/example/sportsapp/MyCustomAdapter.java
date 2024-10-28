package com.example.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.SportsViewHolder> {

    List<Sport> SportsList;
    public MyCustomAdapter(List<Sport> sportsList) {
        SportsList = sportsList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creating view

        View itemView=LayoutInflater.from(parent.getContext()).inflate(
                R.layout.card_item_layout,
                parent,
                false
        );
        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        Sport sport=SportsList.get(position);
        holder.imageView.setImageResource(sport.sportImg);
        holder.textView.setText(sport.sportName);
    }

    @Override
    public int getItemCount() {
        return SportsList.size();
    }


    public static class SportsViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imagviewCard);
        }

    }
}
