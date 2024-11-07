package ejercicios_ud8.ej3;

public class Gato extends Mascota {

    // Zona de declaración de variables
    private final boolean peloLargo;
    private final String color;

    public Gato(boolean peloLargo, String color, String fechaNacimiento, String nombre) {
        super(fechaNacimiento, nombre); // Común en todos los constructores
        this.peloLargo = peloLargo;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gato{");
        sb.append("peloLargo=").append(peloLargo);
        sb.append(", color=").append(color);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha nacimiento=").append(fechaNacimiento);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void emiteSonido() {
        System.out.println("Miau");
    }

}
