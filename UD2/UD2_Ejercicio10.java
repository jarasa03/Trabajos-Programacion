package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio10 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que pida una hora por teclado y que muestre
		 * buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los
		 * tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente. Sólo se tienen en
		 * cuenta las horas, los minutos no se deben introducir por teclado.
		 * 
		 */

		System.out.println("Introduce una hora por teclado, solo un número entero y en formato militar.");
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		sc.close();
		
		if ((num1 > 24) || (num1 < 0)) {
			System.err.println("El número introducido no es una hora");
		}
		else if ((num1 >= 6) && (num1 <= 12)) {
			System.out.println("Buenos días");
		}
		else if ((num1 >= 13) && (num1 <= 20)) {
			System.out.println("Buenas tardes");
		}
		else {
			System.out.println("Buenas noches");
		}
	}

}
