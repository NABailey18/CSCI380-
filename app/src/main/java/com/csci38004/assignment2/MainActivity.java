package com.csci38004.assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create field for property animations button view
        final Button propertyAnimationsButton = findViewById(R.id.viewPropertyAnimationsButton);

        // create field for object animations button view
        final Button objectAnimationsButton = findViewById(R.id.objectAnimationsButton);

        // add a click listener to viewPropertyAnimationsButton to launch ViewPropertyAnimationsActivity
        propertyAnimationsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent propertyIntent = new Intent(v.getContext(), ViewPropertyAnimationsActivity.class);
                v.getContext().startActivity(propertyIntent);
            }
        });

        // add a click listener to objectAnimationsButton to launch ObjectAnimationsActivity
        objectAnimationsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent objectIntent = new Intent(v.getContext(), ObjectAnimationsActivity.class);
                v.getContext().startActivity(objectIntent);
            }
        });
    }
}