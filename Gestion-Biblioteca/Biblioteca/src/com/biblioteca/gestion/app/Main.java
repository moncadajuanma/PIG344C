package com.biblioteca.gestion.app;

import java.util.Scanner;
import java.util.InputMismatchException;
import com.biblioteca.gestion.model.Libro;
import com.biblioteca.gestion.service.LibroService;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        LibroService service = new LibroService();
        int opcion = -1;

        do {
            try {
                mostrarMenu();
                opcion = sc.nextInt();

                switch (opcion) {
                case 1:
                    agregarLibro(sc, service);
                    break;

                    case 2:
                    service.listarLibro();
                    break;

                    case 3:
                    System.out.println("Ingrese el autor o titulo del libro a buscar: ");
                    sc.nextLine();
                    service.consultarLibro2(sc.nextLine());
                    break;

                    case 4:
                    System.out.println("Ingrese el codigo ISBN a eliminar: ");
                    sc.nextLine();
                    service.eliminarLibro(sc.nextLine());
                    break;

                    case 0:
                    System.out.println("Saliendo del sistema");
                    break;
            
                default:
                    System.out.println();
                    System.out.println("Opcion Invalida");;
            }

            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("El valor ingresado no es valido, ingrese la opcion correcta");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println();
                System.out.println("Error inesperado" + e.getMessage());
                sc.nextLine();
            }

        } while (opcion != 0);
        sc.close();
        System.out.println();
        System.out.println("=== SISTEMA FINALIZADO ===");
        System.out.println();
    }
    
    private static void mostrarMenu(){
        System.out.println();
        System.out.println("=== SISTEMA DE GESTION DE LIBROS ===");
        System.out.println();
        System.out.println("1. Agregar nuevo libro");
        System.out.println("2. Listar libro");
        System.out.println("3. Buscar libro");
        System.out.println("4. Eliminar libro");
        System.out.println("0. Salir");
        System.out.print("Escoja el proceso a realizar: ");
    }

    private static void agregarLibro(Scanner sc, LibroService service){
        try {
            sc.nextLine();
                    System.out.print("Ingrese el codigo ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Ingrese el titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el autor: ");
                    String autor = sc.nextLine();
                    
                    Libro lib = new Libro(isbn, titulo, autor);
                    service.agregarLibro(lib);
        } catch (InputMismatchException e) {
            System.out.println();
            System.out.println("Datos Invalidos");
            sc.nextLine();
        }
    }
}
