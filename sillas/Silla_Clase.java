package sillas;

// @author jarasa03

public class Silla_Clase {
	
	int patas;
	String color;
	int numRuedas;
	
	boolean puedeRodar() {
		if (numRuedas > 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
