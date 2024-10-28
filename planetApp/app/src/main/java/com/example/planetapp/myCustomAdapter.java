package com.example.planetapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class myCustomAdapter extends ArrayAdapter<planet_name> {
    private ArrayList<planet_name> planet;
    Context context;

    // defining Constructor

    public myCustomAdapter(ArrayList<planet_name> planet, Context context) {
        super(context, R.layout.item_list_layout, planet);
        this.planet = planet;
        this.context = context;
    }

    //myViewHolder class: used to cache references to the views within
    //                      an item layout so that they don't need to be
    //                      repeatedly looked up during scrolling
    private static class viewHolder{
        TextView planetName;
        TextView MoonCount;
        ImageView planetImage;
    }

    // get view method: used to create and return a view for a
    //                  specific items in the list.

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get the planet object for the current position
        planet_name planets = getItem(position);

        //inflate layout
        viewHolder myViewHolder;
        final View result;
        if(convertView==null){
            myViewHolder=new viewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(
                    R.layout.item_list_layout,
                    parent,
                    false
            );
            myViewHolder.planetName= (TextView)convertView.findViewById(R.id.planet_name);
            myViewHolder.MoonCount=(TextView)convertView.findViewById(R.id.Moon_Count);
            myViewHolder.planetImage=(ImageView)convertView.findViewById(R.id.imageView);

            result=convertView;
            convertView.setTag(myViewHolder);
        }
        else {
            myViewHolder=(viewHolder)convertView.getTag();
            result=convertView;
        }
        myViewHolder.planetName.setText(planets.getPlanetName());
        myViewHolder.MoonCount.setText(planets.getMoonCount());
        myViewHolder.planetImage.setImageResource(planets.getPlanetImage());

        return result;
    }
}
