package com.example.ejemplo6;

import android.os.Bundle;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class Segundo_Activity extends AppCompatActivity {

    private EditText textNombre,textApellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_);

        textNombre =(EditText) findViewById(R.id.txtname);
        textApellidos =(EditText) findViewById(R.id.txtlastname);

        String name = getIntent().getStringExtra("nombre");
        String lastname = getIntent().getStringExtra("apellido");

        textNombre.setText(name);
        textApellidos.setText(lastname);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}