package formas;

public class TestFormas {
    public static void main(String[] args) {
        // Crear instancias de las subclases
        Formas f1 = new Circulo();
        Formas f2 = new Cuadrado();
        Formas f3 = new Triangulo();
        Formas f4 = new Rectangulo();

        // Llamar al método dibujar() de cada objeto
        f1.dibujar();
        f2.dibujar();
        f3.dibujar();
        f4.dibujar();
    }
}
