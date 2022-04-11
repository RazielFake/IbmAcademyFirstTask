package com.ibm.academia;

import com.ibm.academia.caja.Caja;

public class Main {
    public static void main(String[] args) {
        Caja primerPrueba = new Caja(3, 2, 6);
        System.out.println("Volumen de la caja 1 = " + primerPrueba.calcularVolumen());
        Caja segundaPrueba = new Caja();
        System.out.println("Volumen de la caja 2 = " + segundaPrueba.calcularVolumen());
        primerPrueba.setAncho(5);
        primerPrueba.setAlto(6);
        primerPrueba.setProfundo(-5);
        System.out.println("Volumen de la caja 3 = " + primerPrueba.calcularVolumen());
    }
}
