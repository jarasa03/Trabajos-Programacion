package ud5_ejercicio1;

// @author jarasa03

/**
 * ENUNCIADO: Crea una biblioteca de funciones (librería) para arrays (de una dimensión) de números
 * enteros que contenga las siguientes funciones:
 *
 * a) generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo
 * (mínimo y máximo) se indica como parámetro.
 * 
 * b) minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
 * 
 * c) maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
 * 
 * d) mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
 * 
 * e) estaEnArrayInt: Dice si un número está o no dentro de un array.
 * 
 * f) posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la
 * que se encuentra.
 * 
 * g) volteaArrayInt: Le da la vuelta a un array.
 * 
 * Crea una clase para probar todas las funciones de la librería, además está podrá ser utilizada
 * en cualquier otro ejercicio.
 * 
 */

public class Ejercicio1 {

	// Zona de declaración
	private int[] array;

	// Constructor.
	public Ejercicio1() {
	}

	public int[] getArray() {
		return this.array;
	}

	// Zona de métodos.
	public void generaArrayInt(int n, int min, int max) {
		array = new int[n];
		for (int i = 0; i < array.length; i++) {
			int random = (int) (min + Math.random() * (max - min + 1));
			array[i] = random;
		}
	}

	public int minimoArrayInt(int[] array3) {
		int num = 0;
		for (int i = 0; i < array3.length; i++) {

			// Este primer if es únicamente para la primera iteración,
			// así supongo que el primer num es el menor.
			if (i == 0) {
				num = array3[0];
			}
			if (array3[i] < num) {
				num = array3[i];
			}
		}
		return num;
	}

	public int maximoArrayInt(int[] array3) {
		int num = 0;
		for (int i = 0; i < array3.length; i++) {
			if (i == 0) {
				num = array3[0];
			}
			if (array3[i] > num) {
				num = array3[i];
			}
		}
		return num;
	}

	public double mediaArrayInt(int[] array3) {
		double media = 0;
		for (int i = 0; i < array3.length; i++) {
			media += array3[i];
		}
		media = media / array3.length;
		return media;
	}

	public boolean estaEnArray(int num) {
		boolean esta = false;
		for (int i = 0; i < this.array.length; i++) {
			if (num == this.array[i]) {
				esta = true;
			}
		}
		return esta;
	}

	public int posicionEnArray(int num) {
		int num2 = 0;
		for (int i = 0; i < this.array.length; i++) {
			if (num == this.array[i]) {
				num2 = i;
			}
		}
		return num2;
	}

	public int[] volteaArrayInt() {
		int[] array2;
		array2 = new int[this.array.length];
		for (int i = 0; i < this.array.length; i++) {
			array2[i] = this.array[this.array.length - i - 1];
		}
		return array2;
	}

}
