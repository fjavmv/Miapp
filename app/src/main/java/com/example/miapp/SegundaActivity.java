package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.nio.BufferUnderflowException;
import java.util.Objects;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        //Recuperamos los datos pasados a traves del intent
        Bundle dataInfo = getIntent().getExtras();
        String n = dataInfo.getString("nombre");
        String a = dataInfo.getString("apellido");
        String e = dataInfo.getString("edad");
        String p = dataInfo.getString("peso");
        int edad =dataInfo.getInt("entero");


        TextView txtNombre = findViewById(R.id.edtNombre2);
        TextView txtApellido = findViewById(R.id.edtApellido2);
        TextView txtEdad = findViewById(R.id.edtEdad2);
        TextView txtPeso = findViewById(R.id.edtPeso2);

        txtNombre.setText(n);
        txtApellido.setText(a);
        txtEdad.setText(e);
        txtPeso.setText(p);





    }
}