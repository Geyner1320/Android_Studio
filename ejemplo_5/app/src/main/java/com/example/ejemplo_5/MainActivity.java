package com.example.ejemplo_5;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Alerta por el metodo Toast Inicia
    public void onClick_Toast(View v){
        mensaje("Se ha pulsado Toast");// Metodo OnClick del boton Toast se define la cadena a mostrar en el Toast
    }

    public void mensaje(String cadena){ //Metodo Mensaje recibe como parametro String
        Toast.makeText(this,cadena,Toast.LENGTH_SHORT).show(); //Mostrar Toast con mensaje y longitud de alerta
    }
    //Alerta por el metodo Toast Termina

    //Alerta por el metodo DialogBuilder Inicio
    public void onClick_DialogBuilder(View v){
        alerta("Se ha pulsado DialogBuilder");// Metodo OnClick del boton DialogBuilder se define la cadena a mostrar en el DialogBuilder
    }

    public void alerta(String cadena){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this); //instancia de la alerta
        dialogBuilder.setMessage(cadena); //setiamos el mensaje a mostrar

        dialogBuilder.setCancelable(true).setTitle("Titulo de alerta");//Titulo de la ventana y que se pueda cancelar

        dialogBuilder.create().show(); // Mostrar Ventana
    }
    //Alerta por el metodo DialogBuilder Termina

    //Alerta por el metodo AlertBox Inicia
    public void onClick_AlertBox(View v){
        eleccion("Se ha pulsado AlertBox.");
    }

    public void eleccion(String cadena){
        AlertDialog.Builder alertbox = new AlertDialog.Builder(this);
        alertbox.setMessage(cadena);

        alertbox.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mensaje("Pulsado boton Si");
            }
        });


        alertbox.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mensaje("Pulsado boton No");
            }
        });

        alertbox.show();


    }//Alerta por el metodo AlertBox termina

}