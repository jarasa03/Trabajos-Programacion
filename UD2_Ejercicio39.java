package Unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio39 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: . Escriba un programa que lea un mes en número (1 para enero, 2
		 * para febrero, etc.) y un año e indique el número de días de ese mes. Recuerde
		 * que un año es bisiesto si es divisible por cuatro, excepto cuando es
		 * divisible por 100, a no ser que sea divisible por 400. Así, 1900 no fue
		 * bisiesto, pero el año 2000 sí lo fue.
		 */

		/*
		 * CONTEXTO AÑO BISIESTO: Todos los años bisiestos son divisibles entre 4.
		 * Aquellos años que son divisibles entre 4, pero no entre 100, son bisiestos.
		 * Los años que son divisibles entre 100, pero no entre 400, no son bisiestos.
		 * Sin embargo, los años divisibles entre 100 y entre 400 sí que son bisiestos.
		 */

		System.out.println("Introduce un número primero para el mes y luego para el año.");

		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		int num = sc.nextInt();
		sc.close();
		
		int bis = 0;

		if ((num % 100 == 0) && (num % 400 != 0)) {
			System.out.println("El año no es bisiesto.");
		} else if (((num % 4 == 0) && (num % 100 != 0)) || ((num % 100 == 0) && (num % 400 == 0))) {
			System.out.println("El año es bisiesto.");
			bis = 1;
		} else {
			System.out.println("El año no es bisiesto.");
		}

		if ((bis == 1) && (num2 == 2)) {
			System.out.println("El mes tiene 29 días.");
		}
		else {
		switch (num2) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tiene 31 días.");
			break;
		case 2:
			System.out.println("El mes tiene 28 días.");
			break;
		default:
			System.out.println("El mes tiene 30 días");
			break;
		}
		}

	}

}
