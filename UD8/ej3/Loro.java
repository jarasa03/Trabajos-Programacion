package ejercicios_ud8.ej3;

public class Loro extends Mascota {

    // Zona de declaración de variables
    private final String origen;
    private final boolean habla;

    public Loro(String origen, boolean habla, String fechaNacimiento, String nombre) {
        super(fechaNacimiento, nombre);
        this.origen = origen;
        this.habla = habla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loro{");
        sb.append("origen=").append(origen);
        sb.append(", habla=").append(habla);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha nacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void emiteSonido() {
        System.out.println("Pio");
    }

}
