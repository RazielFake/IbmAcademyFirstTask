package com.ibm.academia;

import com.ibm.academia.empleados.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerentePrincipal = new Gerente("Raziel", "Pineda", "753159", "Avenida 123 Numero 456 CDMX",
                200.78, 789, 567889.98);
        System.out.println("gerentePrincipal = \n" + gerentePrincipal);
        gerentePrincipal.aumentarRemuneracion(50);
        System.out.println("Remuneracion despues de aumento : " + gerentePrincipal.getRemuneracion());
    }
}
