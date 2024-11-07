package ejercicios_ud3_3.movil;

public enum Tarifas {

    // Enumerados
    ELEFANTE("Elefante"),
    TIGRE("Tigre"),
    GATO("Gato");

    // Zona de declaración de variables
    private String tarifa;
    private double coste;

    // Constructor
    Tarifas(String tarifa) {
        this.tarifa = tarifa;
        coste = switch (tarifa) {
            case "Elefante" ->
                0.30;
            case "Tigre" ->
                0.18;
            default ->
                0.07;
        };
    }

    // Getters & Setters

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

}
