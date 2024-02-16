package ud5_ejercicio31;

/**
 * @author Jarasa03
 * 
 *         ENUNCIADO: Crear un programa que lea una frase y encuentre la palabra
 *         de mayor longitud. El programa debe imprimir tanto la palabra como el
 *         número de caracteres de la misma.
 */

import java.util.Scanner;

public class Ejercicio31 {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Scanner sc;
		String cadena;
		String[] cadenaDividida;
		int nCaracteres;
		String palabraLarga;

		// Zona de inicialización de variables.
		sc = new Scanner(System.in);
		nCaracteres = 0;
		palabraLarga = null;

		System.out.println("Introduce una frase.");
		cadena = sc.nextLine();
		sc.close();

		cadenaDividida = new String[cadena.length()];

		cadenaDividida = cadena.split(" ");

		for (int i = 0; i < cadenaDividida.length; i++) {
			if(cadenaDividida[i].length() > nCaracteres) {
				nCaracteres = cadenaDividida[i].length();
				palabraLarga = cadenaDividida[i];
			}
		}
		
		System.out.println("La palabra más larga es: " + palabraLarga + " y su número de carácteres es: " + nCaracteres);
	}
}
