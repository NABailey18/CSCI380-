package com.csci38004.assignment2;

import android.opengl.Matrix;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ViewPropertyAnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_property_animations);

        // create field for dog image view
        ImageView dogImageView = findViewById(R.id.dogImageView);

        // create field for alpha button view

        final Button alphaButton = findViewById(R.id.alphaButton);
        // add click listener to alpha button to start alpha view property animation to dogImageView
        alphaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                // sets alpha animation (opacity) to around 75% because the scale is 0 - 255
                dogImageView.setImageAlpha(191);
            }
        });

        // create field for rotation button view
        final Button rotationButton = findViewById(R.id.rotationButton);
        // add click listener to rotation button to start rotation view property animation to dogImageView
        rotationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                // sets the rotation of the picture to 45 degrees about (0,0)
                dogImageView.setPivotX(dogImageView.getWidth()/2);
                dogImageView.setPivotY(dogImageView.getHeight()/2);
                dogImageView.setRotation(45);
            }
        });

        // create field for scale button view
        final Button scaleButton = findViewById(R.id.scaleButton);
        // add click listener to scale button to start scale view property animation to dogImageView
        scaleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                // sets the scale of the image to center inside
                dogImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            }
        });

        // create field for translation button view
        final Button translationButton = findViewById(R.id.translationButton);
        translationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                // sets the translation of the image to 50 degrees to the right and down
                dogImageView.setTranslationX(50);
                dogImageView.setTranslationY(50);
            }
        });

        // create field for reset button view
        final Button resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                // reset dogImageView back to its original settings
                setContentView(R.layout.activity_view_property_animations);
            }
        });
    }
}
