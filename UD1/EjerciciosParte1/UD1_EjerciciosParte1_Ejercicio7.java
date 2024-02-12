package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte1_Ejercicio7 {

	public static void main(String[] args) {

		/* 	Inicio
		 * 		Definir como enteros num1 y num2
		 * 		Imprimir "Introduce un número"
		 * 		Leer num1
		 * 		Imprimir "Introduce otro número"
		 * 		Leer num2
		 * 		Sumar num1 y num2 y guardar el resultado en suma
		 * 		Restar num1 - num2 y guardar el resultado en resta1
		 * 		Restar num2 - num1 y guardar el resultado en resta2
		 * 		Multiplicar num1 y num2 y guardar el resultado en multi
		 * 		Dividir num1 entre num2 y guardar el resultado en div1
		 * 		Dividir num2 entre num1 y guardar el resultado en div2
		 * 		Imprimir "La suma de num1 + num2 es: " suma
		 * 		Imprimir "La resta de num1 - num2 es: " resta1
		 * 		Imprimir "La resta de num2 - num1 es: " resta2
		 * 		Imprimir "La multiplicación de num1 * num2 es: " multi
		 * 		Imprimir "La división de num1 / num2 es: " div1
		 * 		Imprimir "La división de num2 / num1 es: " div2
		 * 	Final
		*/
		
		int num1;
		int num2;
		int suma;
		int resta1;
		int resta2;
		int multi;
		int div1;
		int div2;
		
		System.out.println("Introduce el primer número");
		Scanner entrada = new Scanner(System.in);
		num1 = entrada.nextInt();
		System.out.println("Introduce otro número");
		num2 = entrada.nextInt();
		entrada.close();
		
		suma = num1 + num2;
		resta1 = num1 - num2;
		resta2 = num2 - num1;
		multi = num1 * num2;
		div1 = num1 / num2;
		div2 = num2 / num1;
		
		System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
		System.out.println("La resta de " + num1 + " - " + num2 + " es: " + resta1);
		System.out.println("La resta de " + num2 + " - " + num1 + " es: " + resta2);
		System.out.println("La multiplicación de " + num1 + " x " + num2 + " es: " + multi);
		System.out.println("La división de " + num1 + " / " + num2 + " es: " + div1);
		System.out.println("La división de " + num2 + " / " + num1 + " es: " + div2);
		
	}

}
