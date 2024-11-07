package ejercicios_ud5;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        boolean interruptor = true;

        // Menú
        while (interruptor) {
            System.out.println("\n----------------------");
            System.out.println("Menú Array");
            System.out.println("----------------------");
            System.out.println("a) Mostrar valores");
            System.out.println("b) Introducir valor");
            System.out.println("c) Salir");
            switch (sc.next()) {
                case "a" -> {
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(array[i] + " ");
                    }
                }
                case "b" -> {
                    System.out.println("Dime el valor a introducir: ");
                    int valorV = sc.nextInt();
                    System.out.println("Dime la posición en la que lo quieres introducir");
                    try {
                        int posicionP = sc.nextInt();
                        array[posicionP] = valorV;
                    } catch (Exception e) {
                        System.err.println("Has de introducir un número entre 0 y 9");
                    }
                }
                case "c" -> {
                    System.out.println("Saliendo del programa");
                    interruptor = false;
                }

                default -> {
                    System.err.println("Introduce una de las letras del menú");
                }
            }
        }
    }

}
