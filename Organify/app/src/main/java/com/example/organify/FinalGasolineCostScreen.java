package com.example.organify;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class FinalGasolineCostScreen extends AppCompatActivity {

    TextView km, l, price, people, total, equipaje, priceXperson;

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_gasoline_cost_screen);
        km = findViewById(R.id.km);
        l = findViewById(R.id.l);
        price = findViewById(R.id.price);
        people = findViewById(R.id.people);
        equipaje = findViewById(R.id.text_equipaje);
        total = findViewById(R.id.total);
        priceXperson = findViewById(R.id.priceXperson);

        Intent calculateGasoline = getIntent();
        Bundle b = calculateGasoline.getExtras();

        //KILOMETROS
        String kilometros = (String) b.get("km");
        km.setText(kilometros);
        Double distancia_kilometros = Double.parseDouble(km.getText().toString());
        km.setText(kilometros + " km");


        //LITROS
        String litros = (String) b.get("l");
        l.setText(litros);
        Double litros_gasolina = Double.parseDouble(l.getText().toString());

        //PRECIO
        String precio = (String) b.get("precio");
        price.setText(precio);
        Double precio_gasolina = Double.parseDouble(price.getText().toString());
        price.setText(precio + "€");

        //PEOPLE
        String persona = (String) b.get("pasajeros");
        people.setText(persona);
        Double total_personas = Double.parseDouble(people.getText().toString());


        //EQUIPAJE
        String equipajeString = (String) b.get("equipaje");
        Double precio_equipaje;
        if (equipajeString.equals("si")) {
            equipaje.setText("SI");
            precio_equipaje = 0.04;
        } else {
            equipaje.setText("NO");
            precio_equipaje = 0.0;
        }


        //TOTAL
        double precio_persona = 0.33f;
        double gasolina_usada = distancia_kilometros * litros_gasolina / 100;
        l.setText(String.format("%.2f", gasolina_usada) + " l");
        double total_gasolina = gasolina_usada * precio_gasolina;
        String precio_total = String.valueOf(total_gasolina + (precio_equipaje + precio_persona) * total_personas);
        Double ptotal = Double.parseDouble(precio_total);
        total.setText(String.format("%.2f", ptotal) + " €");


        //PRICE X PERSON
        Double precioXpersona = ptotal / total_personas;
        priceXperson.setText(String.format("Precio por persona: %.2f", precioXpersona) + " €");
    }
}