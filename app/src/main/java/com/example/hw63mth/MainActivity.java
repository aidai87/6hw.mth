package com.example.hw63mth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw63mth.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new FirstFragment()).commit();
    }
}