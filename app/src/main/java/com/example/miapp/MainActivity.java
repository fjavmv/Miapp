package com.example.miapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtApellido;
    private EditText edtEdad;
    private EditText edtPeso;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = findViewById(R.id.edtNombre);
        edtApellido = findViewById(R.id.edtApellido);
        edtEdad = findViewById(R.id.edtEdad);
        edtPeso = findViewById(R.id.edtPeso);
        btnEnviar = findViewById(R.id.btnGuardar);


        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SegundaActivity.class);
                String nombre = edtNombre.getText().toString();
                String apellido = edtApellido.getText().toString();
                String edad =  edtEdad.getText().toString();
                String peso = edtPeso.getText().toString();
                intent.putExtra("nombre",nombre);
                intent.putExtra("apellido",apellido);
                intent.putExtra("edad",edad);
                intent.putExtra("peso",peso);
                startActivity(intent);
                display(R.string.msj_dataos);
            }
        });
    }
    public void display(int id){
        Toast.makeText(getApplicationContext(),id,Toast.LENGTH_SHORT).show();
    }

}