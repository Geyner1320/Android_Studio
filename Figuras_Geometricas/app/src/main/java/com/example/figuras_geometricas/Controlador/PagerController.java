package com.example.figuras_geometricas.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {

    int numtabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numtabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Triangulo();
            case 1:
                return new Rectangulo();
            case 2:
                return new Paralelogramo();
            case 3:
                return new Trapecio();
            case 4:
                return new Hexagono();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numtabs;
    }
}
