package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte2_Ejercicio2 {

	public static void main(String[] args) {

		boolean r;

		System.out.println("Voy a resolver la siguiente operación: 5 - 2 > 4 AND NOT (0.5 == 1 / 2)");
		// La puerta AND se representa con && y la NOT con !
		r = 5 - 2 > 4 && !(0.5 == 1 / 2);
		System.out.println("La solución es: " + r);

	}

}
