package ud5_ejercicio24;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que pida una cadena de texto por teclado
 *         y luego muestre cada palabra de la cadena en una línea distinta.
 */

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		
		// Zona de declaración de variables.
		Scanner sc;
		String cadena;
		
		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		
		System.out.println("Introduce una frase.");
		cadena = sc.nextLine();
		sc.close();
		
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == ' ') {
				System.out.println();
			} else {
				System.out.print(cadena.charAt(i));
			}
		}
	}

}
