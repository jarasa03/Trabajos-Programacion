package ejercicios_ud8.ej1;

public class Main {

    public static void main(String[] args) {

        // Zona de declaración de variables
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Linea l1 = new Linea(p1, p2);
        Linea l2 = new Linea(2, 5, -3, 6);

        System.out.println("La longitud de la línea 1 es: " + l1.longitudLinea());
        System.out.println("La longitud de la línea 2 es: " + l2.longitudLinea());

        System.out.println(l1);
        System.out.println(l2);

    }
}
