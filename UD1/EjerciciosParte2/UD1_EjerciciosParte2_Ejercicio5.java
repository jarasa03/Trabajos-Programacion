package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio5 {
	
	public static void main(String[] args) {
		
		// Primero defino todas las variables
		boolean respuesta;
		int x;
		int y;
		int z;
		double pi;
		double e;
		
		// Imprimo por pantalla el procedimiento a hacer
		System.out.println("Dado x = 1, y = 4, z = 10, pi = 3.14, e = 2.71");
		System.out.println("pi * x ^ 2 > y OR 2 * pi * x <= z");
		
		// Defino cada variable como el valor indicado en el enunciado
		x = 1;
		y = 4;
		z = 10;
		pi = 3.14;
		e = 2.71;
		
		// Hago la operación e imprimo por pantalla el resultado
		respuesta = pi * x * x > y || 2 * pi * x <= z;
		System.out.println("El resultado de la operación es: " + respuesta);
		
		
	}

}
