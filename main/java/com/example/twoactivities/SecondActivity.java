package com.example.twoactivities;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView scrollTextView;
    TextView headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        scrollTextView = (TextView) findViewById(R.id.scrollText);
        headerView = (TextView) findViewById(R.id.header);

        headerView.setText(intent.getStringExtra(MainActivity.TITLE));
        switch (intent.getStringExtra(MainActivity.CHOICE)) {
            case "one":
                scrollTextView.setText(R.string.text_one);
                break;
            case "two":
                scrollTextView.setText(R.string.Text_Two);
                break;
            case "three":
                scrollTextView.setText(R.string.text_three);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + intent.getStringExtra(MainActivity.CHOICE));
        }
    }
}