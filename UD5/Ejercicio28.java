package ud5_ejercicio28;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que cuente las vocales y consonantes de
 *         una frase. Ten cuidado con los espacios, se deben ignorar.
 */

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		
		// Zona de declaración de variables.
		Scanner sc;
		String cadena;
		char caracter;
		int contadorVocal;
		int contadorConsonante;
		
		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		contadorVocal = 0;
		contadorConsonante = 0;
		
		System.out.println("Introduce una frase.");
		cadena = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) != ' ') {
				caracter = Character.toUpperCase(cadena.charAt(i));
				if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
					contadorVocal++;
				} else {
					contadorConsonante++;
				}
			}
		}
		
		System.out.println("Número de vocales: " + contadorVocal);
		System.out.println("Número de consonantes: " + contadorConsonante);
		
	}

}
