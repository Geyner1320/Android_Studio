package com.example.figuras_geometricas.Controlador;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.figuras_geometricas.R;


public class Triangulo extends Fragment {
    EditText bas,alt;
    TextView res;
    View view;



    public Triangulo() {
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_triangulo, container, false);
        bas = (EditText)view.findViewById(R.id.txtbase);
        alt = (EditText) view.findViewById(R.id.txtaltura);
        res = (TextView) view.findViewById(R.id.txtrespuesta);
        // Inflate the layout for this fragment
        return view;
    }


    public void calcular_area (View view){
        double base1 = Double.parseDouble(bas.getText().toString());
        double altura1 = Double.parseDouble(alt.getText().toString());
        double resultado = base1*altura1;
        String valor = String.valueOf(resultado);
        res.setText(valor);
    }
}