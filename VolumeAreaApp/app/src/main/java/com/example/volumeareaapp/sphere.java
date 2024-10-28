package com.example.volumeareaapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class sphere extends AppCompatActivity {
    TextView myTxt1,myTxt2;
    EditText myEditTxt;
    Button myBtn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        myTxt1=findViewById(R.id.textView3);
        myTxt2=findViewById(R.id.textView4);
        myBtn=findViewById(R.id.button);
        myEditTxt=findViewById(R.id.editText);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ab = myEditTxt.getText().toString();
                int radius=Integer.parseInt(ab);
                double val=4*3.14*radius*radius*radius/3;
                myTxt2.setText("Volume: "+val+"m^3");
            }
        });


    }
}