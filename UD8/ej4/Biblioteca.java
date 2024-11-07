package ejercicios_ud8.ej4;

public class Biblioteca {

    // Zona de declaración de variables
    protected String codigo;
    protected String titulo;
    protected String anyoPublicacion;
    protected String numPag;

    // Constructor
    public Biblioteca(String anyoPublicacion, String codigo, String numPag, String titulo) {
        this.anyoPublicacion = anyoPublicacion;
        this.codigo = codigo;
        this.numPag = numPag;
        this.titulo = titulo;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Biblioteca{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo=").append(titulo);
        sb.append(", anyoPublicacion=").append(anyoPublicacion);
        sb.append(", numPag=").append(numPag);
        sb.append('}');
        return sb.toString();
    }

    public String anyoPublicacion() {
        StringBuilder sb = new StringBuilder();
        sb.append("Año de Publicación=").append(anyoPublicacion);
        return sb.toString();
    }

    public String codigo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código=").append(codigo);
        return sb.toString();
    }

    public String numPag() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número de páginas=").append(numPag);
        return sb.toString();
    }

}
