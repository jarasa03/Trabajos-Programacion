package ejercicios_ud8.ej3;

public class Main {

    public static void main(String[] args) {

        Gato Bolita = new Gato(false, "Blanco", "05/05/2017", "Bolita");
        Perro Firulais = new Perro(false, "Pastor Alemán", "03/03/2020", "Firulais");
        Loro Piolín = new Loro("Madagascar", true, "04/04/2018", "Piolín");

        System.out.println(Bolita);
        System.out.println(Firulais);
        System.out.println(Piolín);

        Bolita.emiteSonido();
        Firulais.emiteSonido();
        Piolín.emiteSonido();

    }

}
