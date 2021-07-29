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
    Button carConsumptionButton, costGasolineButton ,calculateCostButton;
    //ImageView car
    ImageView utilitario, compacto, coupe, berlina, familiar, suv, todoterreno, monovolumen, furgoneta;
    //ImageView gasoline
    ImageView sinplomo95, sinplomo98, diesela, dieselaplus, biodiesel, autogas;


    //Functions
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_gasoline_screen);

        //Car consumption dialog
        carConsumptionButton = findViewById(R.id.dialog_car_consumption_button);
        //Cost gasoline dialog
        costGasolineButton = findViewById(R.id.dialog_cost_gasoline_button);
        //CALCULATE COST BUTTON
        calculateCostButton = findViewById(R.id.calculate_cost_button);
        //TEXT INPUT LAYOUT
        km = findViewById(R.id.kilometros);
        l = findViewById(R.id.litros);
        precio = findViewById(R.id.precio);

        //Car consumption dialog
        carConsumptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                carConsumptionDialog();
            }
        });

        //Cost gasoline dialog
        costGasolineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                costGasolineDialog();
            }
        });

        //Collect data in other activities
        calculateCostButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Warning message
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

    //Dialog cost gasoline
    public void costGasolineDialog(){
        final Dialog createCostGasolineDialog = new Dialog(CalculateGasolineScreen.this);
        createCostGasolineDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        createCostGasolineDialog.setContentView(R.layout.pick_gasoline);

        sinplomo95 = createCostGasolineDialog.findViewById(R.id.sinplomo95);
        sinplomo98 = createCostGasolineDialog.findViewById(R.id.sinplomo98);
        diesela = createCostGasolineDialog.findViewById(R.id.diesela);
        dieselaplus = createCostGasolineDialog.findViewById(R.id.dieselaplus);
        biodiesel = createCostGasolineDialog.findViewById(R.id.biodiesel);
        autogas = createCostGasolineDialog.findViewById(R.id.autogas);

        sinplomo95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precio.setText("1.416");
                createCostGasolineDialog.cancel();
            }
        });

        sinplomo98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precio.setText("1.571");
                createCostGasolineDialog.cancel();
            }
        });

        diesela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precio.setText("1.268");
                createCostGasolineDialog.cancel();
            }
        });

        dieselaplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precio.setText("1.364");
                createCostGasolineDialog.cancel();
            }
        });

        biodiesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precio.setText("1.249");
                createCostGasolineDialog.cancel();
            }
        });

        autogas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                precio.setText("0.762");
                createCostGasolineDialog.cancel();
            }
        });
        createCostGasolineDialog.show();
    }
}