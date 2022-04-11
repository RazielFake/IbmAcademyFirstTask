package com.ibm.academia.almacen;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;
    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCantidad : " + cantidad +
                "\nProteinas : " + proteinas;
    }
}