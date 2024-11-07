package ejercicios_ud8.ej4;

public class Revista extends Biblioteca {

    // Zona de declaración de variables
    private final String numRevista;

    // Constructor
    public Revista(String numRevista, String anyoPublicacion, String codigo, String numPag, String titulo) {
        super(anyoPublicacion, codigo, numPag, titulo);
        this.numRevista = numRevista;
    }

    @Override
    public String toString() {
        return "Revista [codigo=" + codigo + ", numRevista=" + numRevista + ", titulo=" + titulo + ", anyoPublicacion="
                + anyoPublicacion + ", numPag=" + numPag + "]";
    }

}
