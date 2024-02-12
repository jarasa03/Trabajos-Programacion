package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte2_Ejercicio23 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que solicite tres números (pueden tener
		 * decimales) y muestre el resultado de hacer la media de los tres.
		 * 
		 */
		
		// Solicito los tres números.
		System.out.println("Introduce tres números separados por espacios y te daré su media (pueden ser decimales).");

		// Abro el Scanner y doy tipo Double a los tres números.
		Scanner sc = new Scanner(System.in);
		Double num1 = sc.nextDouble();
		Double num2 = sc.nextDouble();
		Double num3 = sc.nextDouble();
		sc.close();
		
		// Calculo la media de los tres números.
		Double media = (num1 + num2 + num3) / 3;
		
		// Muestro la solución por pantalla.
		System.out.println("La media de " + num1 + ", " + num2 + " y " + num3 + " es igual a: " + media);
		
	}

}
