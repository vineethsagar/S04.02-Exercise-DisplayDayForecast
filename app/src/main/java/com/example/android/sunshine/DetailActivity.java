package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String weatherdisplay;
        TextView Displayweather = (TextView) findViewById(R.id.text_View) ;

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent comingIntent = getIntent();

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        if (comingIntent != null) {
            if (comingIntent.hasExtra(Intent.EXTRA_TEXT)) {
                weatherdisplay = comingIntent.getStringExtra(Intent.EXTRA_TEXT);
                Displayweather.setText(weatherdisplay);
            }
        }
        }
    }
