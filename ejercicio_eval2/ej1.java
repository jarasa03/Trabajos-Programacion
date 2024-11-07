package ejercicio_eval2;

import java.util.Random;

/*
 * ENUNCIADO: Crear un array de tamanyo determinado, relleno con numeros aleatorios entre 0 y 9,
 * pero en las posiciones pares ha de haber un numero par y en las impares un impar. Luego ordenar el array.
 * 
 */
public class ej1 {

    public static void main(String args[]) {

        int[] array = new int[10];
        int max = 9;
        int min = 0;

        for (int i = 0; i < array.length; i++) {

            array[i] = random(max, min);
            if (i == 0 || i % 2 == 0) {
                do {
                    array[i] = random(max, min);
                } while (array[i] % 2 != 0 || array[i] == 0);

            } else {
                do {
                    array[i] = random(max, min);
                } while (array[i] % 2 == 0);
            }
            System.out.print(array[i] + " ");

        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(ordenarArray(array)[i] + " ");
        }

    }

    public static int random(int max, int min) {

        Random rd = new Random();
        // int range = rd.nextInt(max) + min;
        int range = rd.nextInt((max - min) + 1) + min;

        return range;
    }

    public static int[] ordenarArray(int[] array) {

        int minimo;


        for (int i = 0; i < array.length; i++) {

            minimo = i;
            // comparador = array[i + 1];


            for (int j = i + 1; j < array.length; j++) {


                if (array[j] < array[minimo]) {

                    minimo = j;
                }

            }
            int temporal = array[minimo];
            array[minimo] = array[i];
            array[i] = temporal;

        }

        return array;

    }

}
