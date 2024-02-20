package unidad6;

/**
 * @author Jarasa03
 * 
 * ENUNCIADO: Crea una biblioteca de funciones de ArrayList.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	// Zona de declaración de variables.
	private ArrayList<Integer> listaArray;
	private int minimo;
	private double media;
	private int contador;

	// Constructor.
	public Ejercicio1() {
		contador = 0; // Valor por defecto para contador.
	}

	public ArrayList<Integer> getListaArray() {
		return listaArray;
	}

	/**
	 * Genera un arrayList de tamaño n con números aleatorios cuyo intervalo (mínimo
	 * y máximo) se indica como parámetro.
	 * 
	 * @param n
	 * @param min
	 * @param max
	 */
	public void generaArrayListInt(int n, int min, int max) {

		listaArray = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			listaArray.add((int) (min + Math.random() * (max - min + 1)));
		}
	}

	/**
	 * Devuelve el mínimo del arrayList que se pasa como parámetro.
	 * 
	 * @return minimo
	 */
	public int minimoArrayListInt() {
		minimo = listaArray.get(0); // Igualo el mínimo a la primera posición.
		for (int i = 0; i < listaArray.size(); i++) {
			if (minimo > listaArray.get(i)) {
				minimo = listaArray.get(i);
			}

		}
		return minimo;
	}

	/**
	 * Devuelve el máximo del arrayList que se pasa como parámetro.
	 * 
	 * @return maximo
	 */
	public int maximoArrayListInt() {
		Collections.sort(listaArray);

		return listaArray.get(listaArray.size() - 1);
	}

	/**
	 * Devuelve la media del arrayList que se pasa como parámetro.
	 * 
	 * @return media
	 */
	public double mediaArrayListInt() {
		media = 0;
		for (int i = 0; i < listaArray.size(); i++) {
			media += listaArray.get(i);
			contador++;
		}

		media /= contador;
		return media;
	}

	/**
	 * Dice si un número está o no dentro de un arrayList.
	 * 
	 * @param num
	 * @return true or false
	 */
	public boolean estaEnArrayListInt(int num) {
		return listaArray.contains(num);
	}

	/**
	 * Busca un número en un arrayList y devuelve la posición (el índice) en la que
	 * se encuentra.
	 * 
	 * @param num
	 * @return posicion en ArrayList
	 */
	public int posicionArrayListInt(int num) {
		return listaArray.indexOf(num);
	}

	/**
	 * Le da la vuelta a un arrayList.
	 * 
	 * @return lista al revés
	 */
	public ArrayList<Integer> volteaArrayList() {
		ArrayList<Integer> listaArrayReves = new ArrayList<Integer>();
		for (int i = listaArray.size() - 1; i >= 0; i--) {
			listaArrayReves.add(listaArray.get(i));
		}
		return listaArrayReves;
	}

	@Override
	public String toString() {
		return this.listaArray.toString();
	}

}
