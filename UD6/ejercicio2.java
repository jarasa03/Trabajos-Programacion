package ejercicios_ud6;

import java.util.ArrayList;
import java.util.Scanner;

import libreria_ud6.arraylist;

public class ejercicio2 {

    public static void main(String[] args) {

        // Zona de declaración de variables
        boolean interruptor = true;

        System.out.println("Introduce la altura de diferentes personas, cuando introduzcas un cero, terminas");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> alturas = new ArrayList<>();

        while (interruptor) {
            int altura = sc.nextInt();
            if (altura == 0) {
                interruptor = false;
                sc.close();
            } else {
                alturas.add(altura);
            }
        }

        System.out.println("La media de las alturas es: " + arraylist.mediaArrayListInt(alturas));
        System.out.println("El máximo de las alturas es: " + arraylist.maximoArrayListInt(alturas));
        System.out.println("El mínimo de las alturas es: " + arraylist.minimoArrayListInt(alturas));
        System.out.println("Número de personas por encima de la media: " + porEncima(alturas, arraylist.mediaArrayListInt(alturas)));
        System.out.println("Número de personas por debajo de la media: " + porDebajo(alturas, arraylist.mediaArrayListInt(alturas)));

    }

    /**
     *
     * @param alturas ArrayList<Integer> con las alturas de las personas
     * @param num Numero a buscar
     * @return Número de personas que tienen altura mayor a "num"
     */
    public static int porEncima(ArrayList<Integer> alturas, int num) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > num) {
                contador++;
            }
        }
        return contador;
    }

    /**
     *
     * @param alturas ArrayList<Integer> con las alturas de las personas
     * @param num Numero a buscar
     * @return Número de personas que tienen altura menor a "num"
     */
    public static int porDebajo(ArrayList<Integer> alturas, int num) {
        int contador = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < num) {
                contador++;
            }
        }
        return contador;
    }

}
