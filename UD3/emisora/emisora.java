package ejercicios_ud3_2.emisora;

public class emisora {

    // Zona de declaración de variables
    private double frecuencia;
    private final int inicioFrecuencia = 80;
    private final int finalFrecuencia = 108;

    // Zona de constructores
    public emisora() { // Si no defino la frecuencia, esta será 80 por defecto
        this.frecuencia = 80;
    }

    public emisora(double frecuencia) { // Constructor al uso
        this.frecuencia = frecuencia;
    }

    // Getters y setters
    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("emisora{");
        sb.append("frecuencia=").append(frecuencia);
        sb.append('}');
        return sb.toString();
    }

    // Zona de métodos
    public void subirEmisora() { // Para subir de emisora
        if (this.frecuencia == finalFrecuencia) { // Si está en el máximo da la vuelta
            this.frecuencia = inicioFrecuencia;
        } else {
            this.frecuencia += 0.5;
        }
    }

    public void bajarEmisora() {
        if (this.frecuencia == inicioFrecuencia) {
            this.frecuencia = finalFrecuencia;
        } else {
            this.frecuencia -= 0.5;
        }
    }

}
