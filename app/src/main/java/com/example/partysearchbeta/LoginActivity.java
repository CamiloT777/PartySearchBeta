package com.example.partysearchbeta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextPass;
    private Button buttonAceptar;
    String usuario;
    String pass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //Casting:
        editTextUsuario=(EditText)findViewById(R.id.txt_usuario);
        editTextPass=(EditText)findViewById(R.id.txt_contraseña);
        buttonAceptar=(Button)findViewById(R.id.btn_ingresar);


        buttonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usuario=editTextUsuario.getText().toString();
                pass=editTextPass.getText().toString();
                if (login(usuario,pass)){
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("user",usuario);
                    intent.putExtra("nombre","Juan Perez");
                    intent.putExtra("correo","info@apecssi.com");
                    startActivity(intent);
                    finish();

                }else{
                    Toast.makeText(getApplicationContext(),"Usuario Incorrecto",Toast.LENGTH_LONG).show();
                }
            }
        });



    }

    private boolean login(String usuario, String pass){
        return (usuario.contentEquals("user") && pass.contentEquals("123"))?true:false;
    }
}