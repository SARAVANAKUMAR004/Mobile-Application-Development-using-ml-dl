package com.example.fontconverter;

import android.os.Bundle;

import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mTextView = findViewById(R.id.text_view);

        // Creating a typeface
        Typeface font = Typeface.createFromAsset(getAssets(), "JellyBomb.ttf");

        // Setting the TextView typeface
        mTextView.setTypeface(font);
    }
}
