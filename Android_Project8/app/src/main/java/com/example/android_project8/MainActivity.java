package com.example.android_project8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie m = new Movie("The jungle", "Yousef Saleh", 53.6, 17, "fiction");
        Movie m2 = new Movie("The Sea", "John", 45.6, 14, "non-fiction");


    }
}