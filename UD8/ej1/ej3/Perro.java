package ejercicios_ud8.ej3;

public class Perro extends Mascota {

    // Zona de declaración de variables
    private final String raza;
    private final boolean pulgas;

    public Perro(boolean pulgas, String raza, String fechaNacimiento, String nombre) {
        super(fechaNacimiento, nombre); // Común a todos los constructores
        this.pulgas = pulgas;
        this.raza = raza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Perro{");
        sb.append("raza=").append(raza);
        sb.append(", pulgas=").append(pulgas);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha nacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void emiteSonido() {
        System.out.println("Guau");
    }
}
