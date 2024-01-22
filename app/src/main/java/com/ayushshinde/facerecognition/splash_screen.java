package com.ayushshinde.facerecognition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.atharvakale.facerecognition.R;


/**
 * The splash_screen class represents an activity that displays a splash screen for a certain duration
 * and then navigates to the main activity.
 */
public class splash_screen extends AppCompatActivity {

    /**
     * Called when the activity is starting. This is where most initialization should go.
     *
     * @param savedInstanceState The saved state of the activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Create a handler to delay the navigation to the main activity
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an intent to navigate to the main activity
                Intent intent = new Intent(splash_screen.this, MainActivity.class);

                // Finish the current activity
                finish();

                // Start the main activity
                startActivity(intent);
            }
        }, 2500); // Delay for 2500 milliseconds (2.5 seconds)
    }
}
