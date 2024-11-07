package ejercicios_ud5;

import static libreria_ud5.arrays.estaEnArrayInt;
import static libreria_ud5.arrays.generaArrayInt;
import static libreria_ud5.arrays.maximoArrayInt;
import static libreria_ud5.arrays.mediaArrayInt;
import static libreria_ud5.arrays.minimoArrayInt;
import static libreria_ud5.arrays.posicionEnArrayInt;
import static libreria_ud5.arrays.volteaArrayInt;


public class ejercicio1 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        int tamanyoArray = 10;
        int[] array;

        // Primero pruebo a crear el array e imprimirlo
        array = generaArrayInt(3, 10, tamanyoArray);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Ahora saco el mínimo, máximo y media.
        System.out.println("\nMínimo: " + minimoArrayInt(array));
        System.out.println("Máximo: " + maximoArrayInt(array));
        System.out.println("Media: " + mediaArrayInt(array));

        // Esta en Array y Posicion en Array
        System.out.println("Está el número 6 en el array? --> " + estaEnArrayInt(array, 6));
        System.out.println("En qué posición está dicho número? --> " + posicionEnArrayInt(array, 6));

        // Volteo el array
        array = volteaArrayInt(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
