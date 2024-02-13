package ud5_ejercicio4;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa que permita al usuario almacenar una secuencia
 * aritmética en un array y luego mostrarla. Una secuencia aritmética es una
 * serie de números que comienza por un valor inicial V, y continúa con
 * incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7,
 * 9... Con V=7 e I=10, la secuencia sería 7, 17, 27, 37... El programa
 * solicitará al usuario V, I además de N (no de valores a crear).
 */

public class Ejercicio4 {
	
	// Zona de constructores.
	public Ejercicio4() {};
	
	public int[] secuenciaAritmetica(int v, int i, int n) {
		int[] array;
		
		array = new int[n];
		array[0] = v;
		for (int j = 1; j < array.length; j++) {
			array[j] = v + i * j;
		}
		return array;
	}

}
