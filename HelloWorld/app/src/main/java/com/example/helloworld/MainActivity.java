package com.example.helloworld;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int val = item.getItemId();
        if (val == R.id.searh) {
            Toast.makeText(this, "search button is pressed", Toast.LENGTH_SHORT).show();
        } else if (val == R.id.home) {
            Toast.makeText(this, "home button is pressed", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }

}