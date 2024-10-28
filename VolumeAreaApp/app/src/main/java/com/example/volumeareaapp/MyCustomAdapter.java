package com.example.volumeareaapp;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {
    ArrayList<Shape> ShapeArrayList;
    Context context;

    public MyCustomAdapter(ArrayList<Shape> shapeArrayList, Context context) {
        super(context,R.layout.grid_item_layout,shapeArrayList);
        ShapeArrayList = shapeArrayList;
        this.context = context;
    }
    public static class ViewHolder{
        TextView textView;
        ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape=getItem(position);

        ViewHolder myViewHolder;

        if(convertView==null){
            myViewHolder=new ViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(
                    R.layout.grid_item_layout,
                    parent,
                    false
            );

            myViewHolder.imageView=(ImageView) convertView.findViewById(R.id.imageView);
            myViewHolder.textView=(TextView) convertView.findViewById(R.id.textView);

            convertView.setTag(myViewHolder);
        }else{
            myViewHolder=(ViewHolder) convertView.getTag();
        }
        myViewHolder.textView.setText(shape.getShapeName());
        myViewHolder.imageView.setImageResource(shape.getShapeImage());
        return convertView;
    }
}
