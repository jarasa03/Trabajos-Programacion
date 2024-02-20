package ud5_ejercicio32;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Realiza un programa que lea una frase por teclado e
 *         indique si la frase es un palíndromo o no (ignorando espacios y sin
 *         diferenciar entre mayúsculas y minúsculas). Supondremos que el
 *         usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
 *         acentos, etc.). Un palíndromo es un texto que se lee igual de
 *         izquierda a derecha que de derecha a izquierda. Por ejemplo:
 * 
 *         Arriba la birra
 * 
 *         Allí va Ramón y no maravilla
 * 
 *         Ana lava lana
 * 
 *         Ella te da detalle
 */

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		String cadena;
		Scanner sc;
		char[] array1;
		char[] array2;
		int contador;
		String cadena2;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);

		System.out.println("Introduce una frase y te diré si es o no palíndromo.");
		cadena = sc.nextLine();
		sc.close();
		
		array1 = new char[cadena.length()];
		array2 = new char[cadena.length()];
		contador = cadena.length() - 1;
		
		for(int i = 0; i < cadena.length(); i++) {
			array1[i] = cadena.charAt(i);
			array2[contador] = cadena.charAt(i);
			contador--;
		}
		
		// Convierte el string en un array y lo guardo en cadena2.
		cadena2 = array2.toString();
		
		// Convierto todo espacio en nada, para poder compararlo después.
		cadena.replace(" ", "");
		cadena2.replace(" ", "");
		
		if(cadena.equalsIgnoreCase(cadena2)) {
			System.out.println("Es palíndromo");
		} else {
			System.out.println("No es palíndromo");
		}
		
		
	}

}
