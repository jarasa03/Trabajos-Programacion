package ud5_ejercicio26;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que pida por teclado tres cadenas de
 *         texto: nombre y dos apellidos. Luego mostrará un código de usuario
 *         (en mayúsculas) formado por la concatenación de las tres primeras
 *         letras de cada uno de ellos. Por ejemplo si se introduce “Juan”,
 *         “Moreno” y “Carmona” mostrará “JUAMORCAR”.
 */

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		String cadena1;
		String cadena2;
		String cadena3;
		Scanner sc;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);

		System.out.println("Introduce tu nombre.");
		cadena1 = sc.nextLine();
		System.out.println("Introduce tu primer apellido.");
		cadena2 = sc.nextLine();
		System.out.println("Introduce tu segundo apellido.");
		cadena3 = sc.nextLine();
		sc.close();

		System.out.println((cadena1.substring(0, 2) + cadena2.substring(0, 2) + cadena3.substring(0, 2)).toUpperCase());
	}

}
