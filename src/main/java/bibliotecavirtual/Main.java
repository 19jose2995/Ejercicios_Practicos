package bibliotecavirtual;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        // Agregar algunos libros de prueba
        try (Scanner scanner = new Scanner(System.in)) {
            // Agregar algunos libros de prueba
            biblioteca.agregarLibro(new Libro("1984", "George Orwell", 1949, "Distopía"));
            biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Realismo mágico"));
            biblioteca.agregarLibro(new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, "Fábula"));
            
            int opcion;
            do {
                System.out.println("\n--- Biblioteca Virtual ---");
                System.out.println("1. Agregar libro");
                System.out.println("2. Buscar libro por título");
                System.out.println("3. Buscar libro por autor");
                System.out.println("4. Prestar libro");
                System.out.println("5. Devolver libro");
                System.out.println("6. Mostrar libros disponibles");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el título del libro: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Ingrese el autor del libro: ");
                        String autor = scanner.nextLine();
                        System.out.print("Ingrese el año de publicación: ");
                        int anio = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        System.out.print("Ingrese el género del libro: ");
                        String genero = scanner.nextLine();
                        biblioteca.agregarLibro(new Libro(titulo, autor, anio, genero));
                    }
                    case 2 -> {
                        System.out.print("Ingrese el título del libro: ");
                        biblioteca.buscarPorTitulo(scanner.nextLine());
                    }
                    case 3 -> {
                        System.out.print("Ingrese el autor del libro: ");
                        biblioteca.buscarPorAutor(scanner.nextLine());
                    }
                    case 4 -> {
                        System.out.print("Ingrese el título del libro a prestar: ");
                        biblioteca.prestarLibro(scanner.nextLine());
                    }
                    case 5 -> {
                        System.out.print("Ingrese el título del libro a devolver: ");
                        biblioteca.devolverLibro(scanner.nextLine());
                    }
                    case 6 -> biblioteca.mostrarLibrosDisponibles();
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }
            } while (opcion != 0);
        }
    }
}

