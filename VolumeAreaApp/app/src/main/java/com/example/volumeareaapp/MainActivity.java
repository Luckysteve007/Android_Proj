package com.example.volumeareaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView MyGridView;
    ArrayList<Shape> ShapeArrayList;

    MyCustomAdapter myCustomAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyGridView=findViewById(R.id.gridview);
        ShapeArrayList=new ArrayList<>();
        Shape s1=new Shape("cube",R.drawable.cube);
        Shape s2=new Shape("cuboide",R.drawable.cuboide);
        Shape s3=new Shape("cylinder",R.drawable.cylinder);
        Shape s4=new Shape("sphere",R.drawable.sphere);
        ShapeArrayList.add(s1);
        ShapeArrayList.add(s2);
        ShapeArrayList.add(s3);
        ShapeArrayList.add(s4);

        myCustomAdapter= new MyCustomAdapter(ShapeArrayList,getApplicationContext());
        MyGridView.setAdapter(myCustomAdapter);
        MyGridView.setNumColumns(2);
        MyGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i1=new Intent(getApplicationContext(), sphere.class);

                Intent i2=new Intent(getApplicationContext(),cylinder.class);
                startActivity(i1);
                startActivity(i2);

            }
        });
    }
}