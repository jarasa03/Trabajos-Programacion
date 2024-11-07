package ejercicio_eval1;

/*
 * ENUNCIADO: 3. Crea un programa que cree dos arrays de enteros de tamanyo 100.
 * Luego introducirá en el primer array todos los valores del 1 al 100.
 * Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso,
 * y mostrar ambos por pantalla.
 */
public class ej3 {

    public static void main(String args[]) {

        int[] array1 = new int[100];
        int[] array2 = new int[100];
        int j = array1.length - 1; // Es un contador

        for (int i = 0; i < array1.length; i++) {

            array1[i] = i + 1;

        }

        /* for (int i = array2.length - 1; i > 0; i--) {

            array2[i] = (int)array1[i];

        }
         */
        for (int i = 0; i < array1.length; i++) {

            /* for (int j = array1.length - 1; j > 0; j--) {

                array2[j] = array1[i];
                

            }
             */

            array2[j] = array1[i];
            j--;

        }

        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {

            System.out.print(array2[i] + " ");

        }

    }

}
