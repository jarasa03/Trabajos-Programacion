package ejercicios_ud5;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        // Zona de declaración de variables
        int[][] array = new int[10][4];
        String respuesta; // Es String para que no me puedan meter números
        Scanner sc = new Scanner(System.in);
        boolean interruptor = true; // Para el menú

        for (int i = 0; i < 10; i++) { // Relleno el array bidimensional
            array[i][0] = i + 1;
            array[i][1] = (int) ((Math.random() * (4 - 0 + 1)) + 0);
        }

        while (interruptor) {
            System.out.println("--------------------------------------------------------");
            System.out.print("| Mesa num:   ");
            for (int i = 0; i < 10; i++) {
                System.out.print(" | " + array[i][0]);
            }
            System.out.print("\n| Ocupación:  ");
            for (int i = 0; i < 10; i++) {
                System.out.print(" | " + array[i][1]);
            }
            System.out.println("\n--------------------------------------------------------");

            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            respuesta = sc.nextLine();
            if ("-1".equals(respuesta)) {
                System.out.println("Saliendo del programa");
                interruptor = false;
            } else if (!esSoloNumeros(respuesta) || "-1".equals(respuesta)) { // Controlo que no metan cualquier caracter que no sea un número entero positivo
                System.out.println("Debes introducir un número válido.");
            } else if (Integer.parseInt(respuesta) > 4) { // Controlo que no me den un grupo mayor a 4 personas.
                System.out.println("Lo siento, no admitimos grupos de " + respuesta + ", haga grupos de 4 personas como máximo e intente de nuevo.");
            } else {
                ponerMesa(respuesta, array);
            }
        }
        sc.close();
    }

    /**
     *
     * @param input El String a comparar
     * @return Si es un caracter numérico entero positivo o no
     */
    public static boolean esSoloNumeros(String input) {
        return input.matches("\\d+");
    }

    /**
     *
     * @param numPersonas Las personas que hay en el grupo
     * @param array Las personas totales del restaurante
     *
     * Actualiza el número de personas en las mesas
     */
    public static void ponerMesa(String numPersonas, int[][] array) {
        int numPersonasInt = Integer.parseInt(numPersonas);
        for (int i = 0; i < array.length; i++) {
            if (array[i][1] == 0) {
                array[i][1] = numPersonasInt;
                break;
            }
            if ((i == (array.length - 1)) && array[i][1] != 0) { // Si en la última iteración tampoco está la mesa vacía ahora miro mesas con hueco
                for (int j = 0; j < array.length; j++) {
                    if ((numPersonasInt + array[j][1]) <= 4) {
                        array[j][1] += numPersonasInt;
                        break;
                    }
                    if ((j == (array.length - 1)) && (numPersonasInt + array[j][1]) > 4) { // Si tampoco encuentro mesas con hueco en la última iteración, no puedo acoger al grupo en el restaurante
                        System.out.println("Lo sentimos, no tenemos hueco para ese número de personas");
                    }
                }
            }
        }
    }

}
