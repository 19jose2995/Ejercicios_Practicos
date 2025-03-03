import java.util.ArrayList;
import java.util.List;

public class Recursos_1{

    // Primer método: Retornar un mensaje
    public String obtenerMensaje() {
        return "Programación Orientada a Objetos";
    }

    // Segundo método: Evaluar edad del estudiante
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Multiplicación de dos enteros
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Cuarto método: Retornar lista de números del 1 al X
    public List<Integer> generarListaNumeros(int x) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            numeros.add(i);
        }
        return numeros;
    }

    public static void main(String[] args) {
        Recursos recursos = new Recursos();

        // Llamar a los métodos y mostrar los resultados
        System.out.println(recursos.obtenerMensaje());

        System.out.println(recursos.verificarEdad(25)); // Ejemplo: Mayor de edad
        System.out.println(recursos.verificarEdad(18)); // Ejemplo: Menor de edad

        System.out.println(recursos.multiplicar(5, 3)); // Ejemplo: 15

        List<Integer> lista = recursos.generarListaNumeros(10);
        System.out.println(lista); // Ejemplo: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
