package com.ibm.academia;

import com.ibm.academia.almacen.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Lacteo leche = new Lacteo("Lala", 23.50, 7, 34);
        productos.add(leche);
        Lacteo queso = new Lacteo("Chedar", 234.45, 10, 44);
        productos.add(queso);
        Fruta manzana = new Fruta("Manzana", 34.6, 2, "Dorada");
        productos.add(manzana);
        Fruta kiwi = new Fruta("Kiwi", 55.66, 3, "Verde");
        productos.add(kiwi);
        Limpieza jabon = new Limpieza("Salvo", 44.55, "Suavizante", 12);
        productos.add(jabon);
        Limpieza cloro = new Limpieza("Clorox", 44.5, "Hipoclorito", 15);
        productos.add(cloro);
        NoPerecible sal = new NoPerecible("Sal", 34.4, 5, 13);
        productos.add(sal);
        NoPerecible azucar = new NoPerecible("Azucar", 23.4, 6, 45);
        productos.add(azucar);
        for(Producto producto : productos){
            System.out.println(producto);
        }
    }
}
