package com.example.organify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalGasolineCostScreen extends AppCompatActivity {

    TextView km, l, price, people, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_gasoline_cost_screen);
        km = findViewById(R.id.km);
        l = findViewById(R.id.l);
        price = findViewById(R.id.price);
        people = findViewById(R.id.numberPassengers);
        total = findViewById(R.id.total);

        Intent calculateGasoline = getIntent();
        Bundle b = calculateGasoline.getExtras();

        //KILOMETROS
        String kilometros = (String) b.get("km");
        km.setText(kilometros);
        Double distancia_kilometros = Double.parseDouble(km.getText().toString());

        //LITROS
        String litros = (String) b.get("l");
        l.setText(litros);
        Double litros_gasolina = Double.parseDouble(l.getText().toString());

        //PRECIO
        String precio = (String) b.get("precio");
        price.setText(precio);
        Double precio_gasolina = Double.parseDouble(price.getText().toString());

        //PEOPLE
        String persona = (String) b.get("pasajeros");
        people.setText(persona);
        Double precio_persona = Double.parseDouble(people.getText().toString());

        //TOTAL
        double gasolina_usada = distancia_kilometros * litros_gasolina / 100;
        double total_gasolina = gasolina_usada * precio_gasolina;
        String precio_total = String.valueOf(total_gasolina + (precio_persona * 0.33));
        total.setText(precio_total);
    }
}