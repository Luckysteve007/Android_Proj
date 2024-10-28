package com.example.abc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView MyTxt=findViewById(R.id.textView2);
    TextView MYTxt=findViewById(R.id.textView3);
    EditText EdtTxt=findViewById(R.id.editText);
    Button MyBtn = findViewById(R.id.button);
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=EdtTxt.getText().toString();
                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("text",username);
                startActivity(intent);
            }
        });
    }

}
