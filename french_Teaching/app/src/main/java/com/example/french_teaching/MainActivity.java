package com.example.french_teaching;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Black_btn,Red_btn,Pink_btn,Green_btn,Yellow_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Black_btn=findViewById(R.id.Black_btn);
        Red_btn=findViewById(R.id.Red_btn);
        Pink_btn=findViewById(R.id.Pink_btn);
        Green_btn=findViewById(R.id.Green_btn);
        Yellow_btn=findViewById(R.id.Yellow_btn);

        Black_btn.setOnClickListener(this);
        Red_btn.setOnClickListener(this);
        Pink_btn.setOnClickListener(this);
        Yellow_btn.setOnClickListener(this);
        Green_btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int id= v.getId();
        if(id==R.id.Red_btn){
            Play_audio(R.raw.red);
        }else if(id==R.id.Pink_btn){
            Play_audio(R.raw.pink);
        }else if(id==R.id.Black_btn){
            Play_audio(R.raw.black);
        }else if(id==R.id.Yellow_btn){
            Play_audio(R.raw.yellow);
        }else if(id==R.id.Green_btn){
            Play_audio(R.raw.green);
        }
    }
    public void Play_audio(int id){
        MediaPlayer media=MediaPlayer.create(
                this,
                id
        );
        media.start();
    }
}