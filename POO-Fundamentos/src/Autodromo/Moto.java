package Autodromo;

public class Moto extends Veiculo {

    public void ligar() {
        confereCombustivel();
        System.out.println("Moto ligada");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }
}
