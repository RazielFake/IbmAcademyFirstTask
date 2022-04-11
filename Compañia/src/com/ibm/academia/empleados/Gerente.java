package com.ibm.academia.empleados;

public class Gerente extends Empleado{
    double presupuesto;
    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPresupuesto : " + presupuesto;
    }
}
