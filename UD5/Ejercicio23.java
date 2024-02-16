package ud5_ejercicio23;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Necesitamos crear un programa para registrar sueldos de
 *         hombres y mujeres de una empresa y detectar si existe brecha salarial
 *         entre ambos. El programa pedirá por teclado la información de N
 *         personas distintas (valor también introducido por teclado). Para cada
 *         persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo.
 *         Esta información debe guardarse en una única matriz. Luego se
 *         mostrará por pantalla el sueldo medio de cada género.
 */

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		int nPersonas;
		int genero;
		int sueldo;
		int array[][];
		double mediaH;
		double mediaM;
		int contadorH;
		int contadorM;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		mediaH = 0;
		mediaM = 0;
		contadorH = 0;
		contadorM = 0;

		System.out.println("Introduce el número de personas a comparar.");
		nPersonas = sc.nextInt();

		array = new int[nPersonas][2];

		for (int i = 0; i < nPersonas; i++) {
			System.out.println("Introduce el género de la persona, 0 para varón y 1 para mujer.");
			genero = sc.nextInt();
			array[i][0] = genero;
			System.out.println("Introduce el sueldo de dicha persona.");
			sueldo = sc.nextInt();
			array[i][1] = sueldo;
		}
		sc.close();

		for (int i = 0; i < nPersonas; i++) { // Muestro el array solo para comprobación
			for (int j = 0; j < 2; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < nPersonas; i++) { // Suma de valores por sexo.
			if (array[i][0] == 0) {
				mediaH += array[i][1];
				contadorH++;
			} else {
				mediaM += array[i][1];
				contadorM++;
			}
		}
		// Cálculo de las medias.
		mediaH /= contadorH;
		mediaM /= contadorM;

		System.out.println("Sueldo medio hombres: " + mediaH);
		System.out.println("Sueldo medio mujeres: " + mediaM);
	}

}
