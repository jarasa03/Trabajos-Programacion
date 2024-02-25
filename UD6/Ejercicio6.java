package unidad6;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crea un programa que cree un arrayList de enteros e
 *         introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4,
 *         4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 *         muestre por pantalla.
 */

import java.util.ArrayList;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		ArrayList<Integer> listaArray;
		int n;

		// Zona de inicialización de variables.
		listaArray = new ArrayList<>();
		n = 11;

		System.out.println("PROGRAMA QUE MUESTRA UNA SECUENCIA DE VALORES\n");

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				listaArray.add(i);
			}
		}

		System.out.println(listaArray.toString());

	}

}
