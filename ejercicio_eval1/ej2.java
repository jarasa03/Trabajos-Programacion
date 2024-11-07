package ejercicio_eval1;

import java.util.Scanner;

/**
 * ENUNCIADO: 2. Escriba un programa que, utilizando una estructura while,
 * determine si un número es primo o no.
 *
 */
public class ej2 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int divisor = 2;
        boolean interruptor = true;

        System.out.println("Introduce un número y te diré si es primo o no");
        numero = sc.nextInt();
        sc.close();

        while (divisor < numero / 2) {
            if (numero % divisor != 0) {
                divisor += 1;
            } else {
                System.out.println("El número " + numero + " no es primo.");
                interruptor = false;
                break;
            }
        }
        if (interruptor) {
            System.out.println("El número " + numero + " es primo.");
        }

    }
    
}
