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

public class cylinder extends AppCompatActivity {
    TextView myTxt1,myTxt2;
    EditText myEditText1,myEditText2;
    Button myBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        myTxt1=findViewById(R.id.textView5);
        myTxt2=findViewById(R.id.textView6);
        myEditText1=findViewById(R.id.editText1);
        myEditText2=findViewById(R.id.editText2);
        myBtn=findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a=myEditText1.getText().toString();
                String b=myEditText2.getText().toString();
                int r=Integer.parseInt(a);
                int h=Integer.parseInt(b);
                double vol=3.14*r*r*h;
                myTxt2.setText("Volume: "+vol+"m^3");
            }
        });

    }
}