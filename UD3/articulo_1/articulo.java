package ejercicios_ud3_1.articulo_1;

public class articulo {

    // Zona de declaración de variables
    private String nombre;
    private int precioSinIVA;
    private final int IVA = 21;
    private int cuantosQuedan;

    // Constructor
    public articulo(String nombre, int cuantosQuedan, int precioSinIVA) {
        this.cuantosQuedan = cuantosQuedan;
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(int precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre);
        sb.append(" - Precio: ").append(precioSinIVA);
        sb.append("€ - IVA: ").append(IVA);
        sb.append("% - PVP: ").append(this.precioConIVA());
        sb.append("€");
        return sb.toString();
    }

    // Zona de métodos.
    public double precioConIVA() {

        double precioIva = precioSinIVA * IVA;
        double parentesis = precioIva / 100;
        double pvp = parentesis + precioSinIVA;
        return pvp;

    }

}
