package ud5_ejercicio5;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa que pida al usuario dos valores N y M y luego
 * cree un array de tamaño N que contenga M en todas sus posiciones. Luego
 * muestra el array por pantalla.
 */

public class Ejercicio5 {
	
	// Zona de constructores.
	public Ejercicio5() {};

	// Zona de métodos.
	public int[] crearArray(int n, int m) {
		int[] array;
		array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = m;
		}
		return array;
	}
}
