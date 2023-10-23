package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio13 {

	public static void main(String[] args) {

		/*
		 * ENUNCIADO: Crear un programa que muestre el seno, coseno y tangente de 100.
		 * (Utilizar la clase Math)
		 * 
		 */
		
		// Defino la variable pedida en el enunciado.
		int num = 100;
		
		// Hago las operaciones solicitadas.
		double seno = Math.sin(num);
		double coseno = Math.cos(num);
		double tangente = Math.tan(num);
		
		// Imprimo las operaciones solicitadas por pantalla junto a una breve explicación.
		System.out.println("Voy a hacer diferentes operaciones con el número: " + num);
		System.out.println("El seno de " + num + " es igual a: " + seno);
		System.out.println("El coseno de " + num + " es igual a: " + coseno);
		System.out.println("La tangente de " + num + " es igual a: " + tangente);
		
	}

}
