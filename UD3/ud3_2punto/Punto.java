package ud3_2punto;

public class Punto {
	
	// Zona de declaración de variables.
	private int x;
	private int y;

	
	// Setters y getters.
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setXY (int x, int y) { // Para establecer X e Y a la vez.
		this.setX(x);
		this.setY(y);
	}
	
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
}
