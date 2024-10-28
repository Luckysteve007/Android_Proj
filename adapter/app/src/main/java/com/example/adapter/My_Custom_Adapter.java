package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class My_Custom_Adapter extends BaseAdapter {
    private Context context;
    private String[] item;
    public My_Custom_Adapter(Context context, String[] item){
        this.context=context;
        this.item=item;
    }
    @Override
    public int getCount() {
        return item.length;
    }

    @Override
    public Object getItem(int position) {
        return item[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder Holder;
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.base_adapter,parent,false);

            Holder=new ViewHolder();
            Holder.text1=convertView.findViewById(R.id.textView);
            convertView.setTag(Holder);
        }
        else{
            Holder=(ViewHolder) convertView.getTag();
        }
        Holder.text1.setText(item[position]);
        return convertView;
    }
    static class ViewHolder{
        TextView text1;
    }
}
