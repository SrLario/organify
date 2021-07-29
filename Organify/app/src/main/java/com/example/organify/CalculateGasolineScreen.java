package com.example.organify;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class CalculateGasolineScreen extends AppCompatActivity {

    //Variables
    TextInputEditText km, l, precio;
    Button carConsumptionButton, calculateCostButton;
    ImageView utilitario, compacto, coupe, berlina, familiar, suv, todoterreno, monovolumen, furgoneta;


    //Functions
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_gasoline_screen);
        //Car consumption dialog
        carConsumptionButton = findViewById(R.id.dialog_car_consumption_button);

        //CALCULATE COST BUTTON
        calculateCostButton = findViewById(R.id.calculate_cost_button);

        //TEXT INPUT LAYOUT
        km = findViewById(R.id.kilometros);
        l = findViewById(R.id.litros);
        precio = findViewById(R.id.precio);

        carConsumptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carConsumptionDialog();
            }
        });

        calculateCostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (km.getText().toString().isEmpty() || l.getText().toString().isEmpty() || precio.getText().toString().isEmpty()) {
                    Toast.makeText(CalculateGasolineScreen.this, "Debes llenar todas las casillas!", Toast.LENGTH_SHORT).show();
                } else {
                    Intent calculateCost = new Intent(CalculateGasolineScreen.this, FinalGasolineCostScreen.class);
                    calculateCost.putExtra("km", km.getText().toString());
                    calculateCost.putExtra("l", l.getText().toString());
                    calculateCost.putExtra("precio", precio.getText().toString());
                    startActivity(calculateCost);
                }
            }
        });
    }

    //Dialog car consumption
    public void carConsumptionDialog(){
        final Dialog createCarConsumptionDialog = new Dialog(CalculateGasolineScreen.this);
        createCarConsumptionDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        createCarConsumptionDialog.setContentView(R.layout.pick_consumption_car);

        utilitario = createCarConsumptionDialog.findViewById(R.id.utilitario);
        compacto = createCarConsumptionDialog.findViewById(R.id.compacto);
        familiar = createCarConsumptionDialog.findViewById(R.id.familiar);
        coupe = createCarConsumptionDialog.findViewById(R.id.coupe);
        berlina = createCarConsumptionDialog.findViewById(R.id.berlina);
        suv = createCarConsumptionDialog.findViewById(R.id.suv);
        todoterreno = createCarConsumptionDialog.findViewById(R.id.todoterreno);
        monovolumen = createCarConsumptionDialog.findViewById(R.id.monovolumen);
        furgoneta = createCarConsumptionDialog.findViewById(R.id.furgoneta);

        utilitario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("4.6");
                createCarConsumptionDialog.cancel();
            }
        });

        compacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("6.9");
                createCarConsumptionDialog.cancel();
            }
        });

        coupe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("10.3");
                createCarConsumptionDialog.cancel();
            }
        });

        berlina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("8");
                createCarConsumptionDialog.cancel();
            }
        });

        familiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("8.3");
                createCarConsumptionDialog.cancel();
            }
        });

        suv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("8.6");
                createCarConsumptionDialog.cancel();
            }
        });

        todoterreno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("10.3");
                createCarConsumptionDialog.cancel();
            }
        });

        monovolumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("8.5");
                createCarConsumptionDialog.cancel();
            }
        });

        furgoneta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setText("9.8");
                createCarConsumptionDialog.cancel();
            }
        });

        createCarConsumptionDialog.show();
    }
}