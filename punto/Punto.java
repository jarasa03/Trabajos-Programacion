package punto;

public class Punto {

	public static void main(String[] args) {
		
		Punto_Main punto1 = new Punto_Main();
		Punto_Main punto2 = new Punto_Main();
		Punto_Main punto3 = new Punto_Main();
		
		// Dar valores a los atributos.
		punto1.setXY(5, 0);
		punto2.setXY(10, 10);
		punto3.setXY(-3, 7);
		
		// Imprimo las coordenadas.
		System.out.println("Coordenadas originales:");
		System.out.println("X: " + punto1.getX() + " Y: " + punto1.getY());
		System.out.println("X: " + punto2.getX() + " Y: " + punto2.getY());
		System.out.println("X: " + punto3.getX() + " Y: " + punto3.getY());
		
		// Hago operaciones con las coordenadas.
		punto1.setX(punto1.getX() + 3);
		punto1.setY(punto1.getY() * 5);
		
		punto2.setX(punto1.getX() + 10);
		punto2.setY(punto1.getY() * 2);
		
		punto3.setX(punto1.getY() - 5);
		
		// Vuelvo a imprimir las nuevas coordenadas.
		System.out.println("\nNuevas coordenadas:");
		System.out.println("X: " + punto1.getX() + " Y: " + punto1.getY());
		System.out.println("X: " + punto2.getX() + " Y: " + punto2.getY());
		System.out.println("X: " + punto3.getX() + " Y: " + punto3.getY());
	}
	
}
