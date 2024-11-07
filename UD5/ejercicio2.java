package ejercicios_ud5;

import java.util.Scanner;

import static libreria_ud5.arrays.maximoArrayInt;
import static libreria_ud5.arrays.mediaArrayInt;
import static libreria_ud5.arrays.minimoArrayInt;

public class ejercicio2 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        Scanner sc = new Scanner(System.in);
        int tamanyoArray;

        System.out.println("¿Cuántas alturas vas a introducir?");
        tamanyoArray = sc.nextInt();

        int[] array = new int[tamanyoArray]; // Creo el array de las x alturas solicitadas

        for (int i = 0; i < tamanyoArray; i++) {
            System.out.println("Introduce altura: ");
            array[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("La altura media es: " + mediaArrayInt(array));
        System.out.println("La altura mínima es: " + minimoArrayInt(array));
        System.out.println("La altura máxima es: " + maximoArrayInt(array));

        System.out.println("Hay " + porEncimaMedia(array) + " personas por encima de la media");
        System.out.println("Hay " + porDebajoMedia(array) + " personas por debajo de la media");

    }

    /**
     * 
     * @param array
     * @return Cuantos están por encima de la media
     */
    public static int porEncimaMedia(int[] array) {
        // Zona de declaración de variables
        int media = mediaArrayInt(array);
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * 
     * @param array
     * @return Cuántos están por debajo de la media
     */
    public static int porDebajoMedia(int[] array) {
        // Zona de declaración de variables
        int media = mediaArrayInt(array);
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < media) {
                contador++;
            }
        }
        return contador;
    }

}
