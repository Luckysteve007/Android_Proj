package com.example.musicplayerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button StartBtn,StopBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        StartBtn=findViewById(R.id.MyBtn1);
        StopBtn=findViewById(R.id.MyBtn2);

        StartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ServiceIntent=new Intent(getApplicationContext(), MyCustomService.class);
                startService(ServiceIntent);
            }
        });
        StopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ServiceIntent=new Intent(getApplicationContext(), MyCustomService.class);
                stopService(ServiceIntent);
            }
        });
    }
}