package unit_2;

// @author jarasa03

import java.util.*;

public class UD2_Ejercicio32 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear una calculadora con un menú donde las opciones sean: 1.
		 * Sumar, 2. Restar, 3. Multiplicar, 4. Dividir, 0. Salir. Se pedirán dos
		 * números al usuario y según la opción seleccionada se realizará la operación y
		 * mostrará el resultado por pantalla. Cuando realize la operación, deberá
		 * mostrar al usuario el menú, y volver a realizar la operación indicada, hasta
		 * que el usuario pulse 0.
		 */

		int num1 = 1;
//		sc.close();

		while (num1 != 0) {
			System.out.println("Hagamos una operación");
			System.out.println("Introduce 1 para Sumar.");
			System.out.println("Introduce 2 para Restar.");
			System.out.println("Introduce 3 para Multiplicar.");
			System.out.println("Introduce 4 para Dividir.");
			System.out.println("Introduce 0 para Salir.");
			Scanner sc = new Scanner(System.in);
			num1 = sc.nextInt();
			switch (num1) {
			case 1:
				System.out.println("Introduce ambos números.");
				int num2 = sc.nextInt();
				int num3 = sc.nextInt();
				int suma = num2 + num3;
				System.out.println("El resultado de la suma es: " + suma);
				break;
			case 2:
				System.out.println("Introduce ambos números.");
				int num4 = sc.nextInt();
				int num5 = sc.nextInt();
				int resta = num4 - num5;
				System.out.println("El resultado de la resta es: " + resta);
				break;
			case 3:
				System.out.println("Introduce ambos números.");
				int num6 = sc.nextInt();
				int num7 = sc.nextInt();
				int multi = num6 * num7;
				System.out.println("El resultado de la multiplicación es: " + multi);
				break;
			case 4:
				System.out.println("Introduce ambos números.");
				int num8 = sc.nextInt();
				int num9 = sc.nextInt();
				double div = (double) num8 / (double) num9;
				System.out.println("El resultado de la división es: " + div);
			case 0:
				System.out.println("Ha salido correctamente de la calculadora.");
				break;
			default:
				System.err.println("Introduce un número válido.");
				break;
			}

		}

	}

}
