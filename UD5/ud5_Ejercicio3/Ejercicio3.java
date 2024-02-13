package ud5_ejercicio3;

// @author jarasa03

/**
 * ENUNCIADO: Crea un programa que cree un array de 10 enteros y luego muestre
 * el siguiente menú con distintas opciones:
 * 
 * a) Mostrar valores.
 * 
 * b) Introducir valor.
 * 
 * c) Salir.
 * 
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá
 * un valor V y una posición P, luego escribirá V en la posición P del array. El
 * menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que
 * terminará el programa.
 */

public class Ejercicio3 {

	// Zona de declaración de variables.

	// Zona de constructores.
	public Ejercicio3() {
	};

	// Zona de encapsulamiento.

	// Zona de métodos.
	public void sustituyeNumero(int array[], int valor, int posicion) {
		array[posicion - 1] = valor;
	}

}
