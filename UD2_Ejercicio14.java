package unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio14 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un menú de una calculadora donde las opciones sean: 1.
		 * Sumar, 2. Restar, 3. Multiplicar, 4. Dividir. Se pedirán dos números al
		 * usuarios y según la opción seleccionada se realizará la operación y mostrará
		 * el resultado por pantalla.
		 * 
		 */

		System.out.println("Bienvenido a la calculadora cutre (solo números enteros).");

		System.out.println("Introduce un 1 para hacer una suma.");
		System.out.println("Introduce un 2 para hacer una resta.");
		System.out.println("Introduce un 3 para hacer una multiplicación.");
		System.out.println("Introduce un 4 para hacer una división.");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		

		switch (num1) {
		case 1:
			System.out.println("Introduce dos números a sumar.");
			Scanner sc2 = new Scanner(System.in);
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			sc2.close();
			int suma = num2 + num3;
			System.out.println("El resultado de tu suma es igual a: " + suma);
			break;
		case 2:
			System.out.println("Introduce dos números a restar.");
			Scanner sc3 = new Scanner(System.in);
			int num4 = sc.nextInt();
			int num5 = sc.nextInt();
			sc3.close();
			if (num4 > num5) {
				int resta1 = num4 - num5;
				System.out.println("El resultado de tu resta es igual a: " + resta1);
			}
			else {
				int resta2 = num5 - num4;
				System.out.println("El resultado de tu resta es igual a: " + resta2);
			}
			break;
		case 3:
			System.out.println("Introduce dos números a multiplicar.");
			Scanner sc4 = new Scanner(System.in);
			int num6 = sc.nextInt();
			int num7 = sc.nextInt();
			sc4.close();
			int multi = num6 * num7;
			System.out.println("El resultado de tu multiplicación es igual a: " + multi);
		case 4:
			System.out.println("Introduce dos números a dividir.");
			Scanner sc5 = new Scanner(System.in);
			float num8 = sc.nextInt();
			float num9 = sc.nextInt();
			sc5.close();
			float div = num8 / num9;
			System.out.println("El resultado de tu división es igual a: " + div);
			break;
		default:
			System.err.println("Introduce un número válido");
		}
		sc.close();

	}

}
