package com.example.organify;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeScreen extends AppCompatActivity {

    //Variables
    ImageView loadTravelButton, newTravelButton;

    //Create layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //Load travel button
        loadTravelButton = findViewById(R.id.load_travel_button);
        //New travel button
        newTravelButton = findViewById(R.id.new_travel_button);

        //Functions
        //Load travel button
        loadTravelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //New travel button
        newTravelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changeActivity = new Intent(HomeScreen.this, NewTravel.class);
                startActivity(changeActivity);
            }
        });
    }
}