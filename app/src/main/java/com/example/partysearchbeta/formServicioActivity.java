package com.example.partysearchbeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.partysearchbeta.modelo.Servicios;

public class formServicioActivity extends AppCompatActivity {
    private EditText s_nombre;
    private EditText s_descripcion;
    private EditText s_precio;
    private EditText s_direccion;
    private EditText s_contactos;

    private Button s_añadir;
    private Button s_publicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_servicio);


        s_nombre = (EditText) findViewById(R.id.s_nombre);
        s_descripcion = (EditText) findViewById(R.id.s_descripcion);
        s_precio = (EditText) findViewById(R.id.s_precio);
        s_direccion = (EditText) findViewById(R.id.s_direccion);
        s_contactos = (EditText) findViewById(R.id.s_contactos);
        s_añadir = (Button) findViewById(R.id.btn_añadir);
        s_publicar = (Button) findViewById(R.id.btn_publicar);


        s_añadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // SuperHelper superHelper = new SuperHelper(getApplicationContext());
               Servicios servicios = new Servicios(s_nombre.getText().toString(), s_descripcion.getText().toString(),s_precio.getText().toString(),s_direccion.getText().toString(),s_contactos.getText().toString());
                String sentencia = null;
                if (sentencia == null) {
                    Toast.makeText(getApplicationContext(), "OK", Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "ERROR " + sentencia, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}