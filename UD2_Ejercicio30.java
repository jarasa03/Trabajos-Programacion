package unit_2;

import java.util.*;

public class UD2_Ejercicio30 {

    public static void main(String[] args) {

        /*
         * ENUNCIADO: Realiza un programa que vaya pidiendo números hasta que se
         * introduzca un numero negativo y nos diga cuantos números se han introducido,
         * la media de los impares y el mayor de los pares. El número negativo sólo se
         * utiliza para indicar el final de la introducción de datos pero no se incluye
         * en el cómputo.
         */

        System.out.println(
                "Introduce una cadena de números y córtala con un negativo, te diré el número de introducidos, la media de los impares y el mayor de los pares.");

        Scanner sc = new Scanner(System.in);

        int num;
        int contadorNumeros = 0;
        int sumaImpares = 0;
        int cantidadImpares = 0;
        int mayorPar = 0;
        boolean primerPar = true;

        do {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();

            if (num >= 0) {
                contadorNumeros++;

                if (num % 2 != 0) {
                    sumaImpares += num;
                    cantidadImpares++;
                } else {
                    if (primerPar || num > mayorPar) {
                        mayorPar = num;
                        primerPar = false;
                    }
                }
            }
        } while (num >= 0);

        if (contadorNumeros > 0) {
            System.out.println("Has introducido un total de: " + contadorNumeros + " números.");

            if (cantidadImpares > 0) {
                double mediaImpares = (double) sumaImpares / cantidadImpares;
                System.out.println("La media de los impares es: " + mediaImpares);
            } else {
                System.out.println("No se introdujeron números impares.");
            }

            if (!primerPar) {
                System.out.println("El mayor de los pares es: " + mayorPar);
            } else {
                System.out.println("No se introdujeron números pares.");
            }
        } else {
            System.out.println("No se introdujo ningún número.");
        }

        sc.close();
    }
}
