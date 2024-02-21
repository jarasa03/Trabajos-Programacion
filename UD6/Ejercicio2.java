package unidad6;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa para realizar cálculos relacionados con
 *         la altura (en metros) de personas. Se pedirá la altura de personas
 *         hasta que se introduzca un 0, y se almacenarán en un arrayList las
 *         alturas introducidas por teclado. Luego mostrará la altura media,
 *         máxima y mínima así como cuántas personas miden por encima y por
 *         debajo de la media.
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		ArrayList<Integer> listaArray;
		int contador;
		double media;
		int num;
		int contadorAlturas1;
		int contadorAlturas2;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		listaArray = new ArrayList<>();
		contador = 0;
		media = 0;
		contadorAlturas1 = 0;
		contadorAlturas2 = 0;

		System.out.println("Introduce alturas, cuando quieras parar pon un 0.");

		do {
			num = sc.nextInt();
			listaArray.add(num);
			media += num;
			contador++;
		} while (num != 0);
		sc.close();

		media /= contador - 1;

		System.out.println("La media es: " + media);

		Collections.sort(listaArray); // Con esto ordeno el array para dejar en la primera posición el mínimo y en la
										// última el máximo.

		System.out.println("El mínimo es: " + listaArray.get(1));
		System.out.println("El máximo es: " + listaArray.get(listaArray.size() - 1));

		for (int i = 1; i < listaArray.size(); i++) {
			if (listaArray.get(i) < media) {
				contadorAlturas1++;
			} else {
				contadorAlturas2++;
			}
		}

		System.out.println("Hay " + contadorAlturas1 + " alturas por debajo de la media.");
		System.out.println("Hay " + contadorAlturas2 + " alturas por encima de la media.");

	}

}
