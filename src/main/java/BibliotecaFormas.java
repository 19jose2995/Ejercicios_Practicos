// Superclase Formas
abstract class Formas {
    // Método abstracto que será implementado por las subclases
    abstract void dibujar();
}

// Subclase Circulo
class Circulo extends Formas {
    @Override
    void dibujar() {
        System.out.println("Dibujando un Círculo");
    }
}

// Subclase Cuadrado
class Cuadrado extends Formas {
    @Override
    void dibujar() {
        System.out.println("Dibujando un Cuadrado");
    }
}

// Subclase Triangulo
class Triangulo extends Formas {
    @Override
    void dibujar() {
        System.out.println("Dibujando un Triángulo");
    }
}

// Subclase Rectangulo
class Rectangulo extends Formas {
    @Override
    void dibujar() {
        System.out.println("Dibujando un Rectángulo");
    }
}

// Clase principal para probar la herencia
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