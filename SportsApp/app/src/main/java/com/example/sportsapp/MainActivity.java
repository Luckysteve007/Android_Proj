package com.example.sportsapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //adapter view
    RecyclerView myRecyclerView;
    //list
    List<Sport> SportsList;
    //Adapter
    public static MyCustomAdapter myCustomAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView=findViewById(R.id.RecyclerView);

        SportsList=new ArrayList<>();
        Sport s1=new Sport("Football",R.drawable.football);
        Sport s2=new Sport("Basketball",R.drawable.basketball);
        Sport s3=new Sport("Tennis",R.drawable.tennis);
        Sport s4=new Sport("Volleyball",R.drawable.volleyball);
        Sport s5=new Sport("Ping pong",R.drawable.ping);

        SportsList.add(s1);
        SportsList.add(s2);
        SportsList.add(s3);
        SportsList.add(s4);
        SportsList.add(s5);

        myCustomAdapter=new MyCustomAdapter(SportsList);
        myRecyclerView.setAdapter(myCustomAdapter);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}