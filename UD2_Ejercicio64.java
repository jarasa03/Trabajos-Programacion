package Unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio64 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Escribe un programa que pida cinco precios y muestre por pantalla
		 * el precio de venta de cada uno tras aplicarle un 21% de IVA. Implementa y
		 * utiliza la función: 
		 * double precioConIVA(double precio) // Devuelve el preciO tras sumarle un 21%
		 * de IVA
		 */

		// Zona de declaración de variables.
		Scanner sc = new Scanner(System.in);
		double array[] = new double[5];
		
		System.out.println("Introduce 5 precios y te los daré con iva.");
		
		for (int i = 0; i <5; i++) {// Bucle para asignar valores al array y mostrarlos.
			array[i] = sc.nextInt();
			System.out.println(precioConIVA(array[i]));
		}
		sc.close();
		
	}
	/**
	 * Da el precio con IVA.
	 * @param precio
	 * @return iva
	 */
	public static double precioConIVA(double precio) {
		double iva = precio + precio * 0.21;
		return iva;
	}

}
