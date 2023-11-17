package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio29 {

	public static void main(String[] args) {

		/*
		 * Crear un programa que pinte una pirámide por pantalla. La altura se debe
		 * pedir por teclado. El carácter con el que se pinta la pirámide también se
		 * debe pedir por teclado.
		 */

		System.out.println("Voy a hacer una pirámide con el carácter que me introduzcas.");

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la altura de la pirámide:");
		int altura = sc.nextInt();
		System.out.println("Introduce el carácter que compondrá tu pirámide:");
		char car = sc.next().charAt(0);
		sc.close();

		int i = 1;

		while (i <= altura) {
			int espacios = altura - i;

			// Imprime espacios en blanco antes del carácter
			while (espacios > 0) {
				System.out.print(" ");
				espacios--;
			}

			int caracteres = 2 * i - 1;

			// Imprime el carácter
			while (caracteres > 0) {
				System.out.print(car);
				caracteres--;
			}

			System.out.println(); // Cambia de línea para pasar al siguiente nivel de la pirámide
			i++; // Incrementa el contador para avanzar al siguiente nivel
		}
	}
}
