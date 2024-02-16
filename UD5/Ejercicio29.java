package ud5_ejercicio29;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crear un programa que dada una cadena invertir la misma y
 *         mostrar por pantalla. Ejemplo: Entrada: "casa blanca" Salida: "acnalb
 *         asac"
 */

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		String cadena;
		char[] array1;
		char[] array2;
		int contador;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		

		System.out.println("Introduce una frase.");
		cadena = sc.nextLine();
		sc.close();

		// Inicialización de ambos arrays.
		array1 = new char[cadena.length()];
		array2 = new char[cadena.length()];

		contador = cadena.length() - 1;
		
		for (int i = 0; i < cadena.length(); i++) {
			array1[i] = cadena.charAt(i);
			array2[contador] = array1[i];
			contador--;
		}

		for (int i = 0; i < cadena.length(); i++) {
			System.out.print(array2[i]);
		}
	}

}
