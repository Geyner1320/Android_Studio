package com.example.areas_y_perimetros;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Hexagono extends AppCompatActivity {
    private EditText la, apo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagono);
        apo = (EditText) findViewById(R.id.bas);
        la = (EditText) findViewById(R.id.lado);
    }


    public void Calcular_Perimetro(View v) {
        double lad = Double.parseDouble(la.getText().toString());
        double perimetro = lad * 6;
        String res = String.valueOf("El Perimetro es: " + perimetro);
        alertaP(res);// Metodo OnClick del boton DialogBuilder se define la cadena a mostrar en el DialogBuilder
    }

    public void Calcular_Area(View view) {
        double ap = Double.parseDouble(apo.getText().toString());
        double lad = Double.parseDouble(la.getText().toString());
        double perimetro = lad * 6;
        double area = ((perimetro*ap)/2);
        String res = String.valueOf("El Area es: " + area);
        alertaA(res);// Metodo OnClick del boton DialogBuilder se define la cadena a mostrar en el DialogBuilder
    }

    //Alerta por el metodo DialogBuilder Inicia
    public void alertaA(String cadena) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this); //instancia de la alerta
        dialogBuilder.setMessage(cadena); //setiamos el mensaje a mostrar

        dialogBuilder.setCancelable(true).setTitle("PERIMETRO");//Titulo de la ventana y que se pueda cancelar

        dialogBuilder.create().show(); // Mostrar Ventana
    }
    //Alerta por el metodo DialogBuilder Termina

    //Alerta por el metodo DialogBuilder Inicia
    public void alertaP(String cadena) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this); //instancia de la alerta
        dialogBuilder.setMessage(cadena); //setiamos el mensaje a mostrar

        dialogBuilder.setCancelable(true).setTitle("PERIMETRO");//Titulo de la ventana y que se pueda cancelar

        dialogBuilder.create().show(); // Mostrar Ventana
    }
}
//Alerta por el metodo DialogBuilder Termina