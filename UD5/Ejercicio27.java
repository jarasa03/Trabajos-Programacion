package ud5_ejercicio27;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que muestre por pantalla cuantas vocales
 *         de cada tipo hay (cuantas ‘a’, cuantas ‘e’, etc.) en una frase
 *         introducida por teclado. No se debe diferenciar entre mayúsculas y
 *         minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
 * 
 *         • No de A's: 3
 * 
 *         • No de E's: 1
 * 
 *         • No de I's: 2
 * 
 *         • No de O's: 0
 * 
 *         • No de U's: 0
 */

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		String cadena;
		int contadorA;
		int contadorE;
		int contadorI;
		int contadorO;
		int contadorU;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		contadorA = 0;
		contadorE = 0;
		contadorI = 0;
		contadorO = 0;
		contadorU = 0;

		System.out.println("Introduce una frase.");
		cadena = sc.nextLine();
		sc.close();

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A') {
				contadorA++;
			} else if (cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E') {
				contadorE++;
			} else if (cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I') {
				contadorI++;
			} else if (cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O') {
				contadorO++;
			} else if (cadena.charAt(i) == 'u' || cadena.charAt(i) == 'U') {
				contadorU++;
			}
		}
		
		System.out.println("Nº de As: " + contadorA);
		System.out.println("Nº de Es: " + contadorE);
		System.out.println("Nº de Is: " + contadorI);
		System.out.println("Nº de Os: " + contadorO);
		System.out.println("Nº de Us: " + contadorU);
	}

}
