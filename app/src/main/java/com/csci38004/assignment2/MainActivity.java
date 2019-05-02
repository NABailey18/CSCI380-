package com.csci38004.assignment2;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button cakeAnimationsButton = findViewById(R.id.cakeButton);
        final Button cookieAnimationsButton = findViewById(R.id.cookieButton);
        final Button crepeAnimationsButton = findViewById(R.id.crepeButton);

        cakeAnimationsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent propertyIntent = new Intent(v.getContext(), ViewCakeAnimationsActivity.class);
                v.getContext().startActivity(propertyIntent);
            }
        });

        cookieAnimationsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent propertyIntent = new Intent(v.getContext(), ViewCookieAnimationsActivity.class);
                v.getContext().startActivity(propertyIntent);
            }
        });

        crepeAnimationsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent propertyIntent = new Intent(v.getContext(), ViewCrepeAnimationsActivity.class);
                v.getContext().startActivity(propertyIntent);
            }
        });


    }
}

