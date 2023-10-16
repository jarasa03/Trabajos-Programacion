package unit_1;

// @author jarasa03

import java.util.Scanner;

public class UD1_EjerciciosParte1_Ejercicio11 {
	
	public static void main(String[] args) {
		
		/* 	Inicio
		 * 		Definir como entero edad
		 * 		Imprimir "Introduce tu edad por pantalla"
		 * 		Leer edad
		 * 		Si edad >= 18
		 * 			Imprimir "Eres mayor de edad"
		 * 		Si no
		 * 			Imprimir "Eres menor de edad"
		 * 	Final
		 * */
		
		int edad;
		
		System.out.println("Introduce tu edad por pantalla");
		
		Scanner entrada = new Scanner(System.in);
		edad = entrada.nextInt();
		entrada.close();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}
		else {
			System.out.println("Eres menor de edad");
		}
		
	}

}
