package ejercicios_ud3_3.estadio;

public class Zona {

    // Zona de declaración de variables
    private String zona;
    private int numEntradas;
    private int precioEntradas;

    // Constructor
    public Zona(String zona, int numEntradas, int precioEntradas) {
        this.zona = zona;
        this.numEntradas = numEntradas;
        this.precioEntradas = precioEntradas;
    }

    // Getters & Setters
    public int getNumEntradas() {
        return numEntradas;
    }

    public void setNumEntradas(int numEntradas) {
        this.numEntradas = numEntradas;
    }

    public int getPrecioEntradas() {
        return precioEntradas;
    }

    public void setPrecioEntradas(int precioEntradas) {
        this.precioEntradas = precioEntradas;
    }

    public int venderEntradas(int numEntradas) {
        if (numEntradas > this.numEntradas) {
            return 0;
        } else {
            int precioPagar = numEntradas * this.precioEntradas;
            this.setNumEntradas(this.numEntradas - numEntradas); // Actualizo las entradas totales
            return precioPagar;
        }
    }
    

}
