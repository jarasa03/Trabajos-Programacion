package ejercicio2;

/**
 * ENUNCIADO: Crea un programa para realizar cálculos relacionados con la altura
 * (en metros) de personas. Pedirá un valor N y luego almacenará en un array N
 * alturas introducidas por teclado. Luego mostrará la altura media, máxima y
 * mínima así como cuántas personas miden por encima y por debajo de la media.
 * 
 */

public class Ejercicio2 {

	// Zona de declaración de variables.

	// Zona de constructores.
	public Ejercicio2() {
	}

	// Zona de métodos.
	public String alturas(int[] array) {
		double media = 0;
//		int max = 0;
		int min = 0;
		int numEnc = 0;
		int numDeb = 0;
		int[] array2 = new int[array.length];
		int k = 0;

		for (int i = 0; i < array.length; i++) {
			media += array[i];
			if (i == 0) {
				min = array[0];

			}
			for (int j = 0; j < array.length; j++) {
				
				if (array[j] < min && array[j] != -1) {
					min = array[j];
					array2[k] = min;
					array[j] = -1;
					k++;
				}

			}

		}

		media = media / array.length;
		for (int i = 0; i < array.length; i++) {
			if (media > array2[i]) {
				numDeb++;
			} else if (media < array2[i]) {
				numEnc++;
			}
		}
		return "La altura media es igual a " + media + ", la altura máxima es igual a " + array2[array2.length - 1]
				+ " y la altura mínima es de " + array2[0] + ", hay " + numEnc + " números por encima de la media y "
				+ numDeb + " números por debajo de la media";
	}

}
