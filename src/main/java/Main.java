import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        // Llamando al primer método
        System.out.println(recursos.obtenerMensaje());

        // Llamando al segundo método
        int edad = 20; // Puedes cambiar este valor para probar diferentes edades
        System.out.println("Edad: " + edad + " - " + recursos.evaluarEdad(edad));

        // Llamando al tercer método
        int a = 5;
        int b = 10;
        System.out.println("Multiplicación de " + a + " * " + b + " = " + recursos.multiplicar(a, b));

        // Llamando al cuarto método
        int x = 10; // Puedes cambiar este valor para probar diferentes listas
        List<Integer> listaNumeros = recursos.obtenerListaNumeros(x);
        System.out.println("Lista de números del 1 al " + x + ": " + listaNumeros);
    }
}
