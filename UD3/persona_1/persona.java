package ejercicios_ud3_1.persona_1;

public class persona {

    // Zona de declaración de variables
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

    // Constructor
    public persona(String nombre, String apellidos, int edad, String dni) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", edad=").append(edad);
        sb.append(", dni=").append(dni);
        sb.append('}');
        return sb.toString();
    }

}
