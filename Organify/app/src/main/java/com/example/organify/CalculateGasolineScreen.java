package com.example.organify;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class CalculateGasolineScreen extends AppCompatActivity {

    //Variables
    Button carConsumptionButton;
    ImageView utilitario, compacto, coupe, berlina, familiar, suv, todoterreno, monovolumen, furgoneta;


    //Functions
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_gasoline_screen);
        //Car consumption dialog
        carConsumptionButton = findViewById(R.id.dialog_car_consumption_button);
        carConsumptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carConsumptionDialog();
            }
        });
    }

    //Dialog car consumption
    public void carConsumptionDialog(){
        final Dialog createCarConsumptionDialog = new Dialog(CalculateGasolineScreen.this);
        createCarConsumptionDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        createCarConsumptionDialog.setContentView(R.layout.pick_consumption_car);

        utilitario = createCarConsumptionDialog.findViewById(R.id.utilitario);

        utilitario.setEnabled(true);
        createCarConsumptionDialog.show();
    }
}