package ud3_3persona;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa con una clase llamada Persona que representará
 * los datos principales de una persona: dni, nombre, apellidos y edad.
 * 
 * En el main de la clase principal instancia dos objetos de la clase Persona.
 * Luego, pide por teclado los datos de ambas personas (guárdalos en los
 * objetos). Por último, imprime dos mensajes por pantalla (uno por objeto) con
 * un mensaje del estilo “Azucena Luján García con DNI ... es / no es mayor de
 * edad”. ( se comprobará si es mayor de edad o no en el main)
 */

import java.util.Scanner;

public class Persona_Main {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc = new Scanner(System.in);

		// Zona de instanciado de objetos.
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();

		// Solicito los datos de cada persona.
		System.out.println("Introduce el DNI de la primera persona.");
		persona1.setDni(sc.nextLine());
		System.out.println("Introduce el nombre de la primera persona.");
		persona1.setNombre(sc.nextLine());
		System.out.println("Introduce los apellidos de la primera persona.");
		persona1.setApellidos(sc.nextLine());
		System.out.println("Introduce la edad de la primera persona.");
		persona1.setEdad(sc.nextInt());

		sc.nextLine(); // Para poder introducir una línea despues de un entero.

		System.out.println("Introduce el DNI de la segunda persona.");
		persona2.setDni(sc.nextLine());
		System.out.println("Introduce el nombre de la segunda persona.");
		persona2.setNombre(sc.nextLine());
		System.out.println("Introduce los apellidos de la segunda persona.");
		persona2.setApellidos(sc.nextLine());
		System.out.println("Introduce la edad de la segunda persona.");
		persona2.setEdad(sc.nextInt());

		sc.close();

		// Imprimo el resultado.
		if (persona1.mayorDeEdad() == true) {
			System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni()
					+ " es mayor de edad.");
		} else {
			System.out.println(persona1.getNombre() + " " + persona1.getApellidos() + " con DNI " + persona1.getDni()
					+ " es menor de edad.");
		}

		if (persona2.mayorDeEdad() == true) {
			System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni()
					+ " es mayor de edad.");
		} else {
			System.out.println(persona2.getNombre() + " " + persona2.getApellidos() + " con DNI " + persona2.getDni()
					+ " es menor de edad.");
		}
	}

}
