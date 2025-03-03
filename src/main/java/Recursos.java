import java.util.ArrayList;
import java.util.List;

public class Recursos {

    // Primer método: Retornar un mensaje
    public String obtenerMensaje() {
        return "Programación Orientada a Objetos";
    }

    // Segundo método: Evaluar edad del estudiante
    public String evaluarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Multiplicación de dos enteros
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Cuarto método: Retornar lista de números del 1 al X
    public List<Integer> obtenerListaNumeros(int x) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            lista.add(i);
        }
        return lista;
    }

    boolean verificarEdad(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    List<Integer> generarListaNumeros(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
