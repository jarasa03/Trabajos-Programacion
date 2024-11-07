package libreria_ud5;

public class arrays {

    /**
     *
     * @param min
     * @param max
     * @param tamanyo
     * @return Array de tamanyo "tamanyo" con numeros con minimo y maximo "min"
     * y "max" respectivamente
     */
    public static int[] generaArrayInt(int min, int max, int tamanyo) {
        // Zona de declaración de variables
        int[] array = new int[tamanyo];
        int randomNum;

        for (int i = 0; i < array.length; i++) {
            randomNum = (int) (Math.random() * (max - min + 1)) + min;
            array[i] = randomNum;
        }

        return array;
    }

    /**
     *
     * @param array
     * @return Numero minimo del array
     */
    public static int minimoArrayInt(int[] array) {
        // Zona de declaración de variables
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) { // Si el mínimo es mayor que el número en la posicion num del array establezco el mínimo como ese número
                min = array[i];
            }
        }
        return min;
    }

    /**
     *
     * @param array
     * @return Numero maximo del array
     */
    public static int maximoArrayInt(int[] array) {
        // Zona de declaración de variables
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) { // Si el máximo es menor que el número en la posicion num del array establezco el máximo como ese número
                max = array[i];
            }
        }
        return max;
    }

    /**
     *
     * @param array
     * @return Media del array
     */
    public static int mediaArrayInt(int[] array) {
        // Zona de declaración de variables
        int media;
        int contador = 0;
        int sumaMedia = 0;

        for (int i = 0; i < array.length; i++) {
            sumaMedia += array[i]; // Voy sumando los números para hacer la media
            contador++; // Calculo el tamanyo del array
        }

        media = sumaMedia / contador;

        return media;
    }

    /**
     *
     * @param array
     * @param numEnArray
     * @return Si el numero esta o no en el array
     */
    public static boolean estaEnArrayInt(int[] array, int numEnArray) {
        // Zona de declaración de variables
        boolean interruptor = true;
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            if (numEnArray != array[i]) {
                contador++;
            }
        }
        if (contador == array.length) {
            interruptor = false;
        }
        return interruptor;
    }

    public static int posicionEnArrayInt(int[] array, int numPos) {
        // Zona de declaración de variables
        int posicion = 0;

        if (numPos > 0) {
            for (int i = 0; i < array.length; i++) {
                if (numPos == array[i]) {
                    break;
                }
                posicion++;
                if (i == array.length && numPos != array[i]) {
                    posicion = -1; // Posicion si el numero no esta en el array
                }
            }
            return posicion;
        } else {
            System.err.println("Has de introducir un entero positivo");
            return posicion - 1;
        }

        
    }

    public static int[] volteaArrayInt(int[] array) {
        // Zona de declaración de variables
        int[] arrayVolteado = new int[array.length];
        int contador = array.length - 1;

        for (int i = 0; i < array.length; i++) {
            arrayVolteado[i] = array[contador];
            contador--;
        }

        return arrayVolteado;
    }

}
