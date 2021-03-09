package com.example.ejemplo_3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText peso,estatura;
    private TextView imc,resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso =(EditText) findViewById(R.id.pes);
        estatura =(EditText) findViewById(R.id.est);
        imc =(TextView) findViewById(R.id.imc);
        resultado =(TextView) findViewById(R.id.mensaje);
    }

    public void Calcular(View view){
        String valor1 = peso.getText().toString();
        String valor2 = estatura.getText().toString();
        double peso1 = Double.parseDouble(valor1);
        double estatura1 = Double.parseDouble(valor2);
        double operacion = peso1/(estatura1*estatura1);
        String calculo = String.valueOf(operacion);
        imc.setText(calculo);
        if(operacion <= 18.5){
            resultado.setText("la persona desnutrición");
        }if((operacion>=25)&&(operacion<25)){
            resultado.setText("la persona tiene bajo peso");
        }if((operacion>=25)&&(operacion<30)){
            resultado.setText("la persona tiene peso normal");
        }if((operacion>=30)&&(operacion<40)){
            resultado.setText("la persona tiene problemas de obesidad");
        }if(operacion>=40){
            resultado.setText("la persona tiene obesidad severa");
        }
    }
}