package Autodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("456789");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("123789");
        z400.ligar();

        Veiculo generico = z400;
        generico.ligar();
    }
}
