package ud5_ejercicio25;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que pida dos cadenas de texto por teclado
 *         y luego indique si son iguales, además de si son iguales sin
 *         diferenciar entre mayúsculas y minúsculas.
 */

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		String cadena1;
		String cadena2;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);

		System.out.println("Introduce una frase.");
		cadena1 = sc.nextLine();
		System.out.println("Introduce otra frase");
		cadena2 = sc.nextLine();
		sc.close();

		System.out.println("Son las cadenas exactamente iguales? " + cadena1.equals(cadena2));
		System.out.println("Son las cadenas iguales sin tener en cuenta mayúsculas? " + cadena1.equalsIgnoreCase(cadena2));
	}

}
