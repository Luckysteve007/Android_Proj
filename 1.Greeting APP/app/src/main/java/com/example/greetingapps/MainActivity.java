package com.example.greetingapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText MyEditText;
    Button myBtn;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyEditText=findViewById(R.id.myEditText);
        myBtn=findViewById(R.id.MyBtn);
        title=findViewById(R.id.title);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName=MyEditText.getText().toString();
                Toast.makeText(MainActivity.this, "Hello"+inputName+"Welcome To The App", Toast.LENGTH_SHORT).show();
            }
        });
    }
}