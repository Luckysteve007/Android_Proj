package com.example.thegroceryapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListner {
    RecyclerView recyclerView;
    List<Item> itemList;



    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.RecyclerView);
        itemList=new ArrayList<>();
        Item item1=new Item(R.drawable.broccoli,"broccoli","fresh Vegetable from garden");
        Item item2=new Item(R.drawable.capsicum,"capsicum","fresh vegetable from Garden");
        Item item3=new Item(R.drawable.carrot,"carrot","fresh vegetable from Garden");
        Item item4=new Item(R.drawable.tomatoes,"tomatoes","fresh vegetable from Garden");
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);

        myAdapter=new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        myAdapter.setClickListner(this);
    }

    @Override
    public void onClick(View v, int pos) {
        Toast.makeText(this, "You Pressed    "+itemList.get(pos).getItemName(), Toast.LENGTH_SHORT).show();
    }
}