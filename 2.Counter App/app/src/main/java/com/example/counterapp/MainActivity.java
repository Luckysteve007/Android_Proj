package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView WelcomeTxt,counterTxt;
    Button MyBtn;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WelcomeTxt =findViewById(R.id.MyTxtView);
        counterTxt=findViewById(R.id.MyTxtView);
        MyBtn=findViewById(R.id.myBtn);
        MyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterTxt.setText(""+IncreaseCounter());
            }
        });

    }

    public int IncreaseCounter(){
        return ++counter;
    }
}