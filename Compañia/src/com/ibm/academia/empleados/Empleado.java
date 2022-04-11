package com.ibm.academia.empleados;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += (this.remuneracion * ((float)porcentaje/100));
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRemuneracion : " + remuneracion +
                "\nEmpleadoId : " + empleadoId;
    }
}
