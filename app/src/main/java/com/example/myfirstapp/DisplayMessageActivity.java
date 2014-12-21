package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the message from the intent

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(55);
        textView.setText(message);
        textView.setTextColor(getResources().getColor(R.color.orange));


        // Set the text view as the activity layout
        setContentView(textView);
    }
}
