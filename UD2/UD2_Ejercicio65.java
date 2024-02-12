package Unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio65 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Escribe un programa que pida el ancho y alto de un rectángulo y
		 * muestre por pantalla su área y su perímetro. Implementa y utiliza las
		 * funciones:
		 * double perimetroRectangulo(double ancho, double alto) // Devuelve
		 * el perímetro
		 * double areaRectangulo(double ancho, double alto) // Devuelve el
		 * área
		 */

		//Zona de declaración de variables.
		Scanner sc = new Scanner(System.in);
		double ancho;
		double alto;
		
		System.out.println("Introduce el ancho y el alto de tu rectángulo.");
		ancho = sc.nextInt();
		alto = sc.nextInt();
		sc.close();
		
		System.out.println("El área de tu rectángulo es igual a: " + areaRectangulo(ancho, alto));
		System.out.println("El perímetro de tu rectángulo es igual a: " + perimetroRectangulo(ancho, alto));
	}
	/**
	 * Cálculo del perímetro del rectángulo
	 * @param ancho
	 * @param alto
	 * @return área
	 */
	public static double areaRectangulo(double ancho, double alto) {
		double area = ancho * alto;
		return area;
	}
	/**
	 * Cálculo del área
	 * @param ancho
	 * @param alto
	 * @return perímetro
	 */
	public static double perimetroRectangulo(double ancho, double alto) {
		double peri = ancho * 2 + alto * 2;
		return peri;
	}

}
