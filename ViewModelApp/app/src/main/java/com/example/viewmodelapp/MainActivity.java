package com.example.viewmodelapp;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.viewmodelapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;
    MyViewModel myViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBinding= DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );
        myViewModel=new ViewModelProvider(this).get(MyViewModel.class);

        mainBinding.setIncreaseCounter(myViewModel);

        myViewModel.getCounter().observe(this,
                new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer counter) {
                        mainBinding.textView2.setText(""+counter);
                    }
                });
    }
}