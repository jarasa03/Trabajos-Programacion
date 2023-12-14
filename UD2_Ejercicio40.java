package Unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio40 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Realizar un programa que muestre por pantalla los primeros 5
		 * números pares a partir de un número dado.
		 */

		System.out.println("Introduce un número y te daré los cinco pares a partir del mismo.");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		boolean valor;
		
		if (num % 2 == 0) {
			valor = true;
		}
		else {
			valor = false;
		}
		
		if (valor) {
			for (int i = 0; i < 5; i++) {
				num = num + 2;
				System.out.println(num);
			}
		}
		else {
			num = num + 1;
			System.out.println(num);
			for (int j = 0; j < 4; j++) {
				num = num + 2;
				System.out.println(num);
			}
		}
		
	}

}
