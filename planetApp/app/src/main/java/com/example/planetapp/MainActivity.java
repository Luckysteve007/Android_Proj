package com.example.planetapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<planet_name> planetArrayList;
    private static myCustomAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adapter view : a ListView
        listView=findViewById(R.id.listView);

        //arraylist
        planetArrayList=new ArrayList<>();

        planet_name planet1=new planet_name("Mercury","0 Moons", R.drawable.mercuary);
        planet_name planet2=new planet_name("Venus","0 Moons",R.drawable.venus);
        planet_name planet3=new planet_name("Earth","1 Moons",R.drawable.earth);
        planet_name planet4=new planet_name("Mars","2 Moons",R.drawable.mars);
        planet_name planet5=new planet_name("Jupiter","95 Moons",R.drawable.jupiter);
        planet_name planet6=new planet_name("Saturn","146 Moons",R.drawable.saturn);
        planet_name planet7=new planet_name("Uranus","26 Moons",R.drawable.uranus);
        planet_name planet8=new planet_name("neptune","16 Moons",R.drawable.neptune);
        planet_name planet9=new planet_name("Pluto","5 Moons",R.drawable.pluto);
        planetArrayList.add(planet1);
        planetArrayList.add(planet2);
        planetArrayList.add(planet3);
        planetArrayList.add(planet4);
        planetArrayList.add(planet5);
        planetArrayList.add(planet6);
        planetArrayList.add(planet7);
        planetArrayList.add(planet8);
        planetArrayList.add(planet9);

        //arrayAdapter
        adapter=new myCustomAdapter(planetArrayList,getApplicationContext());
        listView.setAdapter(adapter);

        //handling click Listner

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "Planet name: "+adapter.getItem(position).getPlanetName()+"   MoonCount: "+adapter.getItem(position).getMoonCount(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}