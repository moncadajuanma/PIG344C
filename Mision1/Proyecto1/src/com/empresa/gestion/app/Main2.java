package com.empresa.gestion.app;
import java.util.Scanner;

import com.empresa.gestion.model.Empleado;
import com.empresa.gestion.service.EmpleadoService;

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmpleadoService service = new EmpleadoService();
        int opcion;

        do {
            System.out.println("\n ==== MENU DE EMPLEADOS ==== ");
            System.out.println("\n 1. Agregar Empleado ");
            System.out.println("\n 2. Listar Empleado ");
            System.out.println("\n 3. Consultar Empleado ");
            System.out.println("\n 4. Eliminar Empleado ");
            System.out.println("\n 0. Salir ");
            System.out.print("\n Seleccione una opcion: ");
            opcion = sc.nextInt();


            //int id,String nombre, int edad, boolean activo, char genero, double salario, int horasTrabajadas
            switch (opcion) {
                case 1:
                    System.out.print("Id: ");
                    int id = sc.nextInt();

                    System.out.print("Nombre: ");
                    sc.nextLine(); //Limpiar Buffer
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    //sc.nextLine();//Limpiar Buffer
                    int edad = sc.nextInt();

                    System.out.print("Activo (true/false): ");
                    //sc.nextLine(); //Limpiar Buffer
                    boolean activo = sc.nextBoolean();

                    System.out.print("Genero: ");
                    //sc.nextLine(); //Limpiar Buffer
                    char genero = sc.next().charAt(0);

                    System.out.print("Salario: ");
                    //sc.nextLine(); //Limpiar Buffer
                    double salario = sc.nextDouble();

                    System.out.print("Horas Trabajadas: ");
                    //sc.nextLine(); //Limpiar Buffer
                    int horasTrabajadas = sc.nextInt();

                    Empleado emp = new Empleado(id, nombre, edad, activo, genero, salario, horasTrabajadas);
                    service.agregarEmpleado(emp);
                    break;

                    case 2:
                    service.listarEmpleado();
                    break;

                    case 3:
                    System.out.println("Ingrese el Id: ");
                    service.consultarEmpleado(sc.nextInt());
                    break;

                    case 4:
                    System.out.println("Ingrese el id a eliminar: ");
                    service.eliminarEmpleado(sc.nextInt());
                    break;

                    case 0:
                    System.out.println("Saliendo del sistema");
                    break;
            
                default:
                    break;
            }
            
        } while (opcion != 0 );
        sc.close();
    }
    
}