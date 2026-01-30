package com.biblioteca.gestion.service;

import java.util.ArrayList;
import com.biblioteca.gestion.model.Libro;

public class LibroService {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro lib) {
        libros.add(lib);
        System.out.println();
        System.out.println("Libro agregado correctamente");
        System.out.println();
    }

    public void listarLibro() {
        if (libros.isEmpty()) {
            System.out.println();
            System.out.println("No hay libros registrados");
            System.out.println();
            return;
        }
        for (Libro lib : libros) {
            System.out.println();
            System.out.println(lib.resumen());
            System.out.println();
        }

    }

    public void eliminarLibro(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
            libros.remove(i);
            System.out.println();
            System.out.println("Libro eliminado correctamente");
            System.out.println();
            return;
            }
        }
        System.out.println();
        System.out.println("Libro no encontrado");
        System.out.println();
    }

    public void consultarLibro(String texto) {
        for (Libro lib : libros) {
            if (lib.getAutor().equalsIgnoreCase(texto)) {
                System.out.println(lib.resumen());
                return;
            }
            if (lib.getTitulo().equalsIgnoreCase(texto)) {
                System.out.println(lib.resumen());
                return;
            }
        }
        System.out.println();
        System.out.println("Libro no encontrado");
        System.out.println();
    }

    public void consultarLibro2(String texto) {
        for (Libro lib : libros) {
            if (lib.getAutor().equalsIgnoreCase(texto) || lib.getTitulo().equalsIgnoreCase(texto)) {
                System.out.println();
                System.out.println(lib.resumen());
                return;
            }
        }
        System.out.println();
        System.out.println("Libro no encontrado");
        System.out.println();
    }
}
