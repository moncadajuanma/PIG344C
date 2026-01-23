package com.empresa.gestion.app;
import com.empresa.gestion.model.*;
import com.empresa.gestion.service.NominaService;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan Manuel", 48, true, 'M', 1200, 168);
        Gerente gerente1 = new Gerente("Alba Maria", 41, true, 'F', 5500, 168, 1500, "Ventas");
        System.out.println();
        empleado1.presentarse();
        gerente1.presentarse();

        NominaService nomina = new NominaService();
        System.out.println();
        System.out.println("======EMPLEADO=====");
        System.out.println();
        empleado1.mostrarInfoBasica();
        System.out.println("Salario mensual: $ " + empleado1.calcularSalarioMensual());
        System.out.println("Salario anual empleado: $ " + nomina.calcularSalarioAnual(empleado1));
        System.out.println("¿Puede trabajar? " + empleado1.puedeTrabajar());
        System.out.println();
        System.out.println("======GERENTE=====");
        System.out.println();
        gerente1.mostrarInfoBasica();
        System.out.println("Salario mensual: $ " + gerente1.calcularSalarioMensual());
        System.out.println("Salario anual gerente: $ " + nomina.calcularSalarioAnual(gerente1));
        System.out.println("¿Puede trabajar? " + gerente1.puedeTrabajar());
    }
}