package ejercicios_ud5;

import java.util.Arrays;

public class ejercicio6 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        int[] array = new int[55];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            contador = contador + i;
            /* System.out.println("i :" + (i + 1)); */
            Arrays.fill(array, contador, (i + contador + 1), (i + 1));
            /* System.out.println("cont:" + contador); */
        }
        for (int i = 0; i < 55; i++) {
        System.out.print(array[i] + " ");
        }
    }

}
