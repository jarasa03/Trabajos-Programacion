package Unit_2;

// @author jarasa03

import java.util.Scanner;

public class UD2_Ejercicio44 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Escribe un programa que pida el limite inferior y superior de un
		 * intervalo. Si el límite inferior es mayor que el superior lo tiene que volver
		 * a pedir. A continuación se van introduciendo números hasta que introduzcamos
		 * el 0. Cuando termine el programa dará las siguientes informaciones:
		 * 
		 * ◦ La suma de los números que están dentro del intervalo (intervalo abierto).
		 * ◦ Cuantos números están fuera del intervalo. 
		 * ◦ Informa si hemos introducido algún número igual a los límites del intervalo.
		 */

		// Zona de declaración de variables.
		int limInf;
		int limSup;
		int num; // Número introducido para luego operar.
		boolean limSupTrue = true; // Para saber si el límite superior coincide con un número introducido.
		boolean limInfTrue = true; // Para saber si el límite inferior coincide con un número introducido.
		int sumaNumDentro = 0;
		int contadorFuera = 0;
		Scanner sc = new Scanner(System.in);

		// Es un bucle para que el bucle se ejecute siempre que el limite
		// superior sea inferior o igual al inferior y, si es así, ejecuta el if.
		do {
			System.out.println("Dame el límite inferior de tu intervalo.");
			limInf = sc.nextInt();
			System.out.println("Dame el límite superior de tu intervalo.");
			limSup = sc.nextInt();
			if (limSup <= limInf) {
				System.err.println("Introduce unos límites inferiores y superiores válidos.");
			}
		} while (limSup <= limInf);

		System.out.println(
				"Ahora introduce números y te daré información sobre los mismos. Cuando introduzcas el 0 pararás el bucle.");
		
		do { // Bucle para pedir números.
			num = sc.nextInt();
			if (num != limSup) { // Condicional para saber si se introduce el límite superior.
				limSupTrue = false;
			}
			if (num != limInf) { // Condicional para saber si se introduce el límite inferior.
				limInfTrue = false;
			}
			if (num < limInf || num > limSup && num != 0) { // Condicional para saber los numeros fuera del intervalo.
				contadorFuera++;
			} else {
				sumaNumDentro += num;
			}
			
		} while (num != 0);
		
		sc.close();
		
		if (limSupTrue == true) {
			System.out.println("Has introducido el límite superior, en este caso: " + limSup);
		}
		if (limInfTrue == true) {
			System.out.println("Has introducido el límite inferior, en este caso: " + limInf);
		}
		System.out.println("La suma de los números de fuera del límite es igual a: " + sumaNumDentro);
		System.out.println("Hay " + contadorFuera + " números fuera del límite.");

	}

}
