package com.example.organify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewTravel extends AppCompatActivity {

    ConstraintLayout gasolineButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_travel);
        gasolineButton = findViewById(R.id.gasoline_button);

        gasolineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calculateActivity = new Intent(NewTravel.this, CalculateGasolineScreen.class);
                startActivity(calculateActivity);
            }
        });
    }
}