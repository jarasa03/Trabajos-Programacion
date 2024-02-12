package unit_1;

// @author jarasa03

public class UD1_EjerciciosParte1_Ejercicio9 {

	public static void main(String[] args) {

		/* 	Inicio
		 * 		Imprimir "Voy a mostrar por pantalla el número de horas que hay en 10 años teniendo en cuenta que hay 2 bisiestos"
		 * 		Definir como entero num
		 * 		num = 24 * 365 * 10 + 48
		 * 		Imprimir "Hay " num " horas en 10 años."
		 * 	Final
		 * */
		
		System.out.println("Voy a mostrar por pantalla el número de horas que hay en 10 años teniendo en cuenta que hay 2 bisiestos");
		
		int num;
		// 24 son el número de horas en un día, lo multiplico por el número de días en un año y por los 10 años. Después le sumo los 2 días por haber dos años bisiestos.
		num = 24 * 365 * 10 + 48;
		
		System.out.println("\nHay " + num + " horas en 10 años");
	}

}
