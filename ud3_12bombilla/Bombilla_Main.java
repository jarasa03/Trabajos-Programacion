package ud3_12bombilla;

// @author jarasa03

/**
 * ENUNCIADO: Modelar una casa con muchas bombillas, de forma que cada bombilla
 * se pueda encender o apagar individualmente. Para ello, hacer una clase
 * Bombilla con una variable privada que indique si está encendida o apagada,
 * así como un método que nos diga el estado de una bombilla concreta. Además,
 * queremos poner un interruptor general, de forma que si este se apaga, todas
 * las bombillas quedan apagadas. Cuando el interruptor general se activa, las
 * bombillas vuelven a estar encendidas o apagadas, según estuvieran antes. Cada
 * bombilla se enciende y se apaga individualmente, pero solo responde que está
 * encendida si su interruptor particular está activado y además hay luz
 * general.
 */

public class Bombilla_Main {

	public static void main(String[] args) {

		// Zona de declaración de variables.
		Bombilla bombilla1;
		Bombilla bombilla2;
		Bombilla bombilla3;

		// Zona de instanciado de objetos.
		bombilla1 = new Bombilla();
		bombilla2 = new Bombilla();
		bombilla3 = new Bombilla();

		// Doy valores de prueba a las bombillas.
		bombilla1.setInterruptor(false);
		bombilla2.setInterruptor(true);
		bombilla3.setInterruptor(false);

		// Veo que pasa con los interruptores.
		System.out.println("Con el interruptor general encendido, en secuencia de interruptores F, T, F:");
		bombilla1.encendida();
		bombilla2.encendida();
		bombilla3.encendida();

		Bombilla.interruptorGeneral = false;
		System.out.println("\nCon el interruptor general apagado en la misma secuencia:");
		bombilla1.encendida();
		bombilla2.encendida();
		bombilla3.encendida();
	}

}
