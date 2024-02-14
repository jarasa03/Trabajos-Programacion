package ud5_ejercicio6;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa que cree un array de enteros e introduzca la
 * siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5,
 * etc. hasta introducir 10 diez veces, y luego la muestre por pantalla. En esta
 * ocasión has de utilizar Arrays.fill().
 */

import java.util.*;

public class Ejercicio6 {

	// Zona de constructores.
	public Ejercicio6() {
	};

	// Zona de métodos.
	public int[] crearArray() {
		int[] array;
		int d = 0;
		array = new int[55];
		for (int i = 1; i <= 10; i++) {
			Arrays.fill(array, d, d + i, i);
			d += i;
		}
		return array;
	}

}
