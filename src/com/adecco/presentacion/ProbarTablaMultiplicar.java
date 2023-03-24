package com.adecco.presentacion;

import com.adecco.modelo.TablaMultiplicar;

public class ProbarTablaMultiplicar {
    public static void main(String[] args) {
        TablaMultiplicar tm1 = new TablaMultiplicar(5);
        System.out.println(tm1.mostrarTabla());
    }
}
