package com.example.areas_y_perimetros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Triangulo,Hexagono,Rectangulo,Paralelogramo,Trapecio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Triangulo = (Button) findViewById(R.id.tri);
        Hexagono = (Button) findViewById(R.id.hex);
        Rectangulo = (Button) findViewById(R.id.rec);
        Paralelogramo = (Button) findViewById(R.id.para);
        Trapecio = (Button) findViewById(R.id.tra);

        Triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Triangulo.class);
                startActivity(i);
            }
        });

        Rectangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Rectangulo.class);
                startActivity(i);
            }
        });

        Paralelogramo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Paralelogramo.class);
                startActivity(i);
            }
        });

        Hexagono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Hexagono.class);
                startActivity(i);
            }
        });

        Trapecio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Trapecio.class);
                startActivity(i);
            }
        });
    }

}