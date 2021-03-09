package com.example.ejemplo_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText valor1,valor2;
    private TextView resultado;
    private RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1=(EditText)findViewById(R.id.valor1);
        valor2=(EditText)findViewById(R.id.valor2);
        resultado=(TextView)findViewById(R.id.resultado);
        r1=(RadioButton)findViewById(R.id.sumar);
        r2=(RadioButton)findViewById(R.id.restar);

    }

    public void operar(View view){
        String val1 = valor1.getText().toString();
        String val2 = valor2.getText().toString();
        int nro1 = Integer.parseInt(val1);
        int nro2 = Integer.parseInt(val2);
        if(r1.isChecked()==true){
            int suma=nro1+nro2;
            String resu=String.valueOf(suma);
            resultado.setText(resu);
        }else
            if(r2.isChecked()==true){
            int resta = nro1-nro2;
            String resu=String.valueOf(resta);
            resultado.setText(resu);
        }

    }
}