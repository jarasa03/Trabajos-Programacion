package ud3_5articulo;

// @author jarasa03

public class Articulo {

	// Zona de declaración de variables.
	private String nombre;
	private int precioSinIVA;
	public final int IVA = 21; // Lo pongo como final para que no pueda ser cambiado y en mayúsculas porque no
								// cambia.
	private int cuantosQuedan;

	// Zona de encapsulamiento.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPrecioSinIVA(int precioSinIVA) {
		this.precioSinIVA = precioSinIVA;
	}

	public int getPrecioSinIVA() {
		return precioSinIVA;
	}

	public int getIVA() { // No hago un setter porque no quiero que se pueda cambiar.
		return IVA;
	}

	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	// Zona de métodos.
	public int pvp() {
		return precioSinIVA * getIVA();
	}

}
