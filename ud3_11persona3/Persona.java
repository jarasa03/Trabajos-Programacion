package ud3_11persona3;

// @author jarasa03

public class Persona {

	// Zona de declaración de variables.
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

	// Zona de constructores.
	public Persona(String dni, String nombre, String apellidos, int edad) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellidos(apellidos);
		this.setEdad(edad);

	}

	// Zona de encapsulamiento.
	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	// Zona de métodos o funciones.

	// Cálculo de la mayoría de edad.
	public boolean mayorDeEdad() {
		return (getEdad() >= 18);
	}

	public void imprime() {
		System.out.println("DNI: " + dni + "\nnombre: " + nombre + "\napellidos: " + apellidos + "\nedad: " + edad);
	}
	public boolean esJubilado() {
		return (getEdad() >= 65);
	}
}
