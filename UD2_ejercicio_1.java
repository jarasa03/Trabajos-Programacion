package unit_2;

//@author jarasa03

// Importo la librería Scanner.
import java.util.Scanner;

public class UD2_ejercicio_1 {

	public static void main(String[] args) {
		
		// Defino el string nombre.
		String nombre;
		
		// Muestro por pantalla el texto entre comillas.
		System.out.print("Introduce tu nombre ");
		
		// Con esto de debajo solicito una entrada por el usuario.
		Scanner entrada = new Scanner(System.in);

		// Cierro la entrada para que no se puedan meter más datos.
		entrada.close();
		
		// Doy el nombre "nombre" a la variable.
		nombre = entrada.nextLine();
		
		// Imprimo por pantalla Hola y el nombre introducido por el usuario.
		System.out.println("Hola " + nombre);

	}

}
