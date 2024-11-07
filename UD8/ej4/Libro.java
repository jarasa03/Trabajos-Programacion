package ejercicios_ud8.ej4;

public class Libro extends Biblioteca {

    // Zona de declaración de variables
    private final String autor;

    // Constructor
    public Libro(String autor, String anyoPublicacion, String codigo, String numPag, String titulo) {
        super(anyoPublicacion, codigo, numPag, titulo); // Común a todas las clases
        this.autor = autor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("autor=").append(autor);
        sb.append("codigo=").append(codigo);
        sb.append(", titulo=").append(titulo);
        sb.append(", anyoPublicacion=").append(anyoPublicacion);
        sb.append(", numPag=").append(numPag);
        sb.append('}');
        return sb.toString();
    }

}
