package ejercicios_ud3_3.movil;

public class Movil {

    // Zona de declaración de variables
    private final Tarifas tarifa;
    private double consumo;
    private String numero;

    // Constructor
    public Movil(double consumo, Tarifas tarifa, String numero) {
        this.consumo = consumo;
        this.tarifa = tarifa;
        this.numero = numero;
    }

    // Getters & Setters
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Zona de métodos
    public void llamar(int minutos) {
        double calculo;
        calculo = minutos * tarifa.getCoste();
        calculo = (Math.round(calculo * 100.0)) / 100.0;
        calculo += this.getConsumo();
        this.setConsumo(calculo);
    }

    public void reiniciarFactura() { // Pongo el consumo a 0
        this.setConsumo(0);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Movil{");
        sb.append("tarifa=").append(tarifa);
        sb.append(", consumo=").append(consumo);
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }

}
