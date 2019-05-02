package com.csci38004.assignment2;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSeekBar;
import android.view.View;
import android.widget.SeekBar;

/**
 * Note: See {@link AppCompatSeekBar.OnSeekBarChangeListener} to see how to setup interaction
 * listeners for a seek bar.
 */
public class ObjectAnimationsActivity extends AppCompatActivity {

    private View preview;
    private AppCompatSeekBar alphaSeekBar, redSeekBar, greenSeekBar, blueSeekBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animations);

        // create field for preview view
        preview = findViewById(R.id.preview);

        // create field for AppCompatSeekBar alpha
        alphaSeekBar = findViewById(R.id.alphaSeekBar);
        // create an instance of AppCompatSeekBar.OnSeekBarChangeListener inside onCreate()
        // set it on each SeekBar using setOnSeekBarChangeListener()
        alphaSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // call method {@link AppCompatSeekBar.OnSeekBarChangeListener#onProgressChanged(SeekBar, int, boolean)}
                updatePreview();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // create field for AppCompatSeekBar red
        redSeekBar = findViewById(R.id.redSeekBar);
        // create an instance of AppCompatSeekBar.OnSeekBarChangeListener inside onCreate()
        // set it on each SeekBar using setOnSeekBarChangeListener()
        redSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // call method {@link AppCompatSeekBar.OnSeekBarChangeListener#onProgressChanged(SeekBar, int, boolean)}
                updatePreview();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // create field for AppCompatSeekBar green
        greenSeekBar = findViewById(R.id.greenSeekBar);
        // create an instance of AppCompatSeekBar.OnSeekBarChangeListener inside onCreate()
        // set it on each SeekBar using setOnSeekBarChangeListener()
        greenSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // call method {@link AppCompatSeekBar.OnSeekBarChangeListener#onProgressChanged(SeekBar, int, boolean)}
                updatePreview();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // create field for AppCompatSeekBar blue
        blueSeekBar = findViewById(R.id.blueSeekBar);
        // create an instance of AppCompatSeekBar.OnSeekBarChangeListener inside onCreate()
        // set it on each SeekBar using setOnSeekBarChangeListener()
        blueSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // call method {@link AppCompatSeekBar.OnSeekBarChangeListener#onProgressChanged(SeekBar, int, boolean)}
                updatePreview();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    /**
     * TODO:
     * Call this method from a {@link AppCompatSeekBar.OnSeekBarChangeListener#onProgressChanged(SeekBar, int, boolean)}
     * to update {@link ObjectAnimationsActivity#preview}'s backgroundColor. Use each seekbar's
     * {@link AppCompatSeekBar#getProgress()} method to get the progress as an int. Then pass each
     * progress' int to {@link Color#argb(int, int, int, int)} to convert the ints to a {@link Color}.
     * Lastly, use {@link ObjectAnimator#ofArgb(Object, String, int...)} to update the preview's
     * "backgroundColor" property with an animation duration of 300L.
     */
    private void updatePreview() {
        // use each seekbar's {@link AppCompatSeekBar#getProgress()} method to get the progress as an int
        int alpha = alphaSeekBar.getProgress();
        int red = redSeekBar.getProgress();
        int green = greenSeekBar.getProgress();
        int blue = blueSeekBar.getProgress();

        // pass each progress' int to {@link Color#argb(int, int, int, int)} to convert the ints to a {@link Color}
        int color = Color.argb(alpha, red, green, blue);

        // use {@link ObjectAnimator#ofArgb(Object, String, int...)}
        ObjectAnimator.ofArgb(preview,"backgroundColor", color)
            // update the preview's "backgroundColor" property with an animation duration of 300L
            .setDuration(300L)
            .start();
    }
}
