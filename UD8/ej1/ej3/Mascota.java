package ejercicios_ud8.ej3;

public class Mascota {

    // Zona de declaración de variables
    protected String nombre;
    protected String fechaNacimiento;

    // Constructor
    public Mascota(String fechaNacimiento, String nombre) {
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mascotas{");
        sb.append("nombre=").append(nombre);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }

    public void emiteSonido() {
        
    }

}
