package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio24 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que calcule la media de un conjunto de números
		 * positivos introducidos por teclado. A priori, el programa no sabe cuántos
		 * números se introducirán. El usuario indicará que ha terminado de introducir
		 * los datos cuando meta un número negativo.
		 */

		System.out.println(
				"Introduce los números positivos que quieras, cuando introduzcas un negativo entenderé que has terminado y calcularé la media de los números introducidos.");
		
		Scanner sc = new Scanner(System.in);
		int num1 = 1;
		int suma = 0;
		int i = 0;
		
		while (true) {
			num1 = sc.nextInt();
			if (num1 < 0) {
				break;
			}
			suma = num1 + suma;
			i++;
		}
		float media = suma / i;
		sc.close();
		System.out.println("La media es igual a " + media);
	}

}
