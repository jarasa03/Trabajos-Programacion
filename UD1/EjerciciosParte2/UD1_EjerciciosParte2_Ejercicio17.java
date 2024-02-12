package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte2_Ejercicio17 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Las variables de tipo booleano pueden guardar los resultados de
		 * operaciones lógicas. Crea un programa en el que se establezcan tres valores
		 * que representen dinero en euros: un salario, un pago de impuestos y unas
		 * tributaciones a la Seguridad Social. El programa debe mostrar por pantalla
		 * (con valores true o false): 
		 * 
		 * 1. Si se paga más a la Seguridad Social que
		 * impuestos. 
		 *
		 * 2. Si el pago de impuestos y seguridad social superan la mitad del
		 * salario. 
		 * 
		 * 3. Si las dos afirmaciones anteriores son ciertas. 
		 * 
		 * 4. Si el salario
		 * o el pago de impuestos o el pago de Seguridad Social son menores de 500
		 * euros. 
		 * 
		 * 5. Si el pago de impuestos o la Seguridad Social son menores de 200
		 * euros cada uno y el salario supera los 1500.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el salario");
		Double num1 = sc.nextDouble();
		
		System.out.println("Introduce el pago de impuestos");
		Double num2 = sc.nextDouble();
		
		System.out.println("Introduce la tributación a la seguridad social");
		Double num3 = sc.nextDouble();
		
		sc.close();
		
		// Caso número 1.
		if (num3 > num2) {
			System.out.println("Se paga más a la Seguridad Social que de impuestos");
		}
		else {
			System.out.println("Se paga más de impuestos que a la Seguridad Social");
		}
		
		// Caso número 2
		if ((num2 + num3) > (num1 / 2)) {
			System.out.println("La suma del pago de impuestos y el de la Seguridad Social es mayor que la mitad del salario");
		}
		else {
			System.out.println("La suma del pago de impuestos y el de la Seguridad Social es menor a la mitad del salario");
		}
		
		// Caso número 3
		if ((num3 > num2)||((num2 + num3) > (num1 / 2))) {
			System.out.println("Se paga más a la Seguridad Social que a impuestos y también la suma de impuestos y el pago a la seguridad social supera la mitad de salario");
			}
		else {
			System.out.println("O no se paga más a la Seguridad Social o la sima del pago de los impuestos y de la Seguridad Social no supera la mitad del salario");
		}
		
		// Caso número 4
		if (num1 < 500) {
			System.out.println("El salario es menor a 500");
		}
			else if (num2 < 500) {
				System.out.println("El pago de los inpuestos es menor a 500");
			}
			else if (num3 < 500) {
				System.out.println("El pago a la Seguridad Social es inferior a 500");
			}
		else {
				System.out.println("Ningún valor es inferior a 500");
		}
		
		// Caso número 5
		if ((num2 < 200) || (num3 < 200) && (num1 > 1500)) {
			System.out.println("El pago de los impuestos o el de la seguridad social es menor a 200 y el salario supera los 1500");
		}
		else {
			System.out.println("No se cumple que el pago de impuestos o el de la Seguridad Social sea menor a 200 y que el salario supere los 1500");
		}
		}
}
