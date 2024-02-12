package ud3_12bombilla;

// @author jarasa03

public class Bombilla {
	
	// Zona de declaración de variables.
	public static boolean interruptorGeneral = true;
	private boolean interruptor;
	
	// Zona de consctructores.
	
	// Zona de encapsulamiento.
	public void setInterruptor(boolean interruptor) {
		this.interruptor = interruptor;
	}
	
	public boolean getInterruptor() {
		return interruptor;
	}
	
	public void setInterruptorGeneral(boolean interruptorGeneral) {
		Bombilla.interruptorGeneral = interruptorGeneral;
	}
	// Zona de métodos.
	
	public void encendida() {
		if (interruptorGeneral && interruptor) {
			System.out.println("La bombilla está encendida.");
		} else {
			System.out.println("La bombilla está apagada.");
		}
	}
	
	
	

}
