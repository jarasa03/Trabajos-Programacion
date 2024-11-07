package ejercicios_ud5;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        Scanner sc = new Scanner(System.in);
        String respuesta = "0";

        // Solicito ambos arrays
        for (int i = 0; i < 10; i++) {
            do { // Controlo que no se puedan meter nada más que numeros en el array para que no de error
                System.out.println("Introduce 10 valores enteros");
                respuesta = sc.nextLine();
            } while (!esSoloNumeros(respuesta));
            array1[i] = Integer.parseInt(respuesta);
        }
        for (int i = 0; i < 10; i++) {
            do { // Controlo que no se puedan meter nada más que numeros en el array para que no de error
                System.out.println("Introduce otros 10 valores enteros");
                respuesta = sc.nextLine();
            } while (!esSoloNumeros(respuesta));
            array2[i] = Integer.parseInt(respuesta);
        }

        System.out.println("Estos son tus arrays: "); // Muestro los arrays introducidos
        System.out.println("Array 1 --> ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("\nArray 2 --> ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array2[i] + " ");
        }

        sc.close(); // Cierro el scanner

        System.out.println("Son los arrays iguales? --> " + Arrays.equals(array1, array2));

    }

    public static boolean esSoloNumeros(String input) {
        return input.matches("\\d+");
    }

}
