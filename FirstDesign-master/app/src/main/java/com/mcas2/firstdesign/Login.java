package com.mcas2.firstdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    Button alerta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        alerta = (Button)findViewById(R.id.alerta);
        alerta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                alertDialog();
            }
        });


    }

    private void alertDialog(){
        new AlertDialog.Builder(this)
        .setTitle("Contraseña")
                .setMessage("Se ha enviado un email a su cuenta para restablecer su contraseña")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("Mensaje","Cancelado");
                    }
                })
                .show();
    }
}