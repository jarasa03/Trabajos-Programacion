package ejercicio1;

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
