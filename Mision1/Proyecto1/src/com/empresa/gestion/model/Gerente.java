package com.empresa.gestion.model;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int edad, boolean activo, char genero, double salario, int horasTrabajadas, String departamento) {
        super(nombre, edad, activo, genero, salario, horasTrabajadas);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el gerente " + getNombre()  + " y estoy a cargo del departamento de " + departamento);
    }

    
}
