package com.example.twoactivities;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String CHOICE = "com.example.twoactivities.CHOICE";
    public static final String TITLE = "com.example.twoactivities.TITLE";
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, SecondActivity.class);
    }

    public void launchOne(View view) {
        intent.putExtra(CHOICE, "one");
        intent.putExtra(TITLE, "Hello Welcome");
        startActivity(intent);
    }

    public void launchTwo(View view) {
        intent.putExtra(CHOICE, "two");
        intent.putExtra(TITLE, "Welcome to my app");
        startActivity(intent);
    }

    public void launchThree(View view) {
        intent.putExtra(CHOICE, "three");
        intent.putExtra(TITLE, "Thanks for stopping by");
        startActivity(intent);
    }

    public void launchSecondActivity(View view) {
    }
}