package ud5_ejercicio30;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crear un programa que dada una cadena, y un carácter,
 *         indique cuántas veces se repite el carácter en la cadena.
 */

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		String cadena;
		String caracter;
		Scanner sc;
		int contador;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		contador = 0;

		System.out.println("Introduce una frase.");
		cadena = sc.nextLine();
		System.out.println("Introduce un caracter y te diré cuantas veces se repite.");
		caracter = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter.charAt(0)) {
				contador++;
			}
		}

		System.out.println(
				"Tu caracter seleccionado " + caracter + " aparece " + contador + " veces en la frase proporcionada.");

	}

}
