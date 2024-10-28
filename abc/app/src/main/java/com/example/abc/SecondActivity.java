package com.example.abc;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    TextView myTxt= findViewById(R.id.textView);
    Button Btn=findViewById(R.id.button2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int val=RandomValueGenerator();
        Intent i=getIntent();
        String s=i.getStringExtra("text");
        myTxt.setText(""+val);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share(s,val);
            }
        });

    }
    public int RandomValueGenerator(){
        Random r=new Random();
        int upper_limit=100;
        int random_num=r.nextInt(upper_limit);
        return random_num;
    }
    public void share(String name,int val){
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,"your name"+name);
        i.putExtra(Intent.EXTRA_TEXT,"Your Lucky Number"+val);
        startActivity(Intent.createChooser(i,"choose any platform"));
    }
}