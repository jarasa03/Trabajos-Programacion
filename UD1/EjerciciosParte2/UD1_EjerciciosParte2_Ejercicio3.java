package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio3 {
	
	public static void main(String[] args) {
		
		// Primero defino todas las variables
		double respuesta;
		int x;
		int y;
		int z;
		double pi;
		double e;
		
		// Imprimo por pantalla el procedimiento a hacer
		System.out.println("Dado x = 1, y = 4, z = 10, pi = 3.14, e = 2.71");
		System.out.println("2 * x + 0.5 + y - 1/5 * z");
		
		// Defino cada variable como el valor indicado en el enunciado
		x = 1;
		y = 4;
		z = 10;
		pi = 3.14;
		e = 2.71;
		
		// Hago la operación e imprimo por pantalla el resultado
		respuesta = 2 * x + 0.5 + y - 1/5 * z;
		System.out.println("La respuesta es = " + respuesta);
	}

}
