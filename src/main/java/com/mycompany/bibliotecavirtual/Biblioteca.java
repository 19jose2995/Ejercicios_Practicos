package com.mycompany.bibliotecavirtual;
import bibliotecavirtual.Libro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void buscarPorTitulo(String titulo) {
        System.out.println("Resultados de búsqueda por título: " + titulo);
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.mostrarInfo();
                return;
            }
        }
        System.out.println("No se encontró el libro.");
    }

    public void buscarPorAutor(String autor) {
        System.out.println("Resultados de búsqueda por autor: " + autor);
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                libro.mostrarInfo();
            }
        }
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInfo();
            }
        }
    }
}
