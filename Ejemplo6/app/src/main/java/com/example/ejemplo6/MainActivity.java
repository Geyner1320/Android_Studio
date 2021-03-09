package com.example.ejemplo6;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText campoNombre,campoApellidos;
    private Button miBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNombre = (EditText) findViewById(R.id.name); // Campo de texto nombre
        campoApellidos = (EditText) findViewById(R.id.lastname); // Campo de texto apellido
        miBoton = (Button) findViewById(R.id.btnpasar);// Botono para envio de datos

        miBoton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Segundo_Activity.class); // Creo intent que referencie la primera y segunda ventana
                i.putExtra("nombre",campoNombre.getText()+""); // Paso el parametro nombre con el metodo putExtra
                i.putExtra("apellido",campoApellidos.getText()+"");
                startActivity(i);// Activo la intención que se va a enviar
            }
        });


    }
}