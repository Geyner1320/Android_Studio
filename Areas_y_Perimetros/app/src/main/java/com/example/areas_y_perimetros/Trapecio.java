package com.example.areas_y_perimetros;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Trapecio extends AppCompatActivity {

    private EditText baM,bam,altura,lado1,lado2,lado3,lado4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);

        baM = (EditText)findViewById(R.id.basM);
        bam = (EditText)findViewById(R.id.basm);
        altura = (EditText)findViewById(R.id.alt);
        lado1 = (EditText)findViewById(R.id.l1);
        lado2 = (EditText)findViewById(R.id.l2);
        lado3 = (EditText)findViewById(R.id.l3);
        lado4 = (EditText)findViewById(R.id.l4);
    }

    public void Calcular_Area(View view){
        double bm = Double.parseDouble(bam.getText().toString());
        double bM = Double.parseDouble(baM.getText().toString());
        double al = Double.parseDouble(altura.getText().toString());
        Double area = (((bM*bm)*al)/2);
        String res = String.valueOf("El Area es: "+area);
        alertaA(res);// Metodo OnClick del boton DialogBuilder se define la cadena a mostrar en el DialogBuilder
    }

    public void Calcular_Perimetro(View v){
        double lad1 = Double.parseDouble(lado1.getText().toString());
        double lad2 = Double.parseDouble(lado2.getText().toString());
        double lad3 = Double.parseDouble(lado3.getText().toString());
        double lad4 = Double.parseDouble(lado4.getText().toString());
        Double perimetro = lad1+lad2+lad3+lad4;
        String res = String.valueOf("El Perimetro es: "+perimetro);
        alertaP(res);// Metodo OnClick del boton DialogBuilder se define la cadena a mostrar en el DialogBuilder
    }

    //Alerta por el metodo DialogBuilder Inicia
    public void alertaA(String cadena){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this); //instancia de la alerta
        dialogBuilder.setMessage(cadena); //setiamos el mensaje a mostrar

        dialogBuilder.setCancelable(true).setTitle("PERIMETRO");//Titulo de la ventana y que se pueda cancelar

        dialogBuilder.create().show(); // Mostrar Ventana
    }
    //Alerta por el metodo DialogBuilder Termina

    //Alerta por el metodo DialogBuilder Inicia
    public void alertaP(String cadena){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this); //instancia de la alerta
        dialogBuilder.setMessage(cadena); //setiamos el mensaje a mostrar

        dialogBuilder.setCancelable(true).setTitle("PERIMETRO");//Titulo de la ventana y que se pueda cancelar

        dialogBuilder.create().show(); // Mostrar Ventana
    }
    //Alerta por el metodo DialogBuilder Termina
}