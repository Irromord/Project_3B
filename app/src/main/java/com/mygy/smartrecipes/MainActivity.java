package com.mygy.smartrecipes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startBtn = findViewById(R.id.main_startBtn);
        startBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, SelectCategoryActivity.class);
            startActivity(intent);
        });
    }
}