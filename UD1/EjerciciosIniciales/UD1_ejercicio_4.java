package unit_1;

//@author jarasa03

// Importo la librería Scanner.
import java.util.Scanner;

public class UD1_ejercicio_5 {

	public static void main(String[] args) {
		
		// Defino el string nombre.
		String nombre;
		
		// Muestro por pantalla el texto entre comillas.
		System.out.print("Introduce tu nombre ");
		
		// Con esto de debajo solicito una entrada por el usuario.
		Scanner entrada = new Scanner(System.in);
		
		// Doy el nombre "nombre" a la variable.
		nombre = entrada.nextLine();
		
		// Cierro la entrada para que no se puedan meter más datos.
		entrada.close();
		
		// Imprimo por pantalla Hola y el nombre introducido por el usuario.
		System.out.println("Hola " + nombre);

	}

}
