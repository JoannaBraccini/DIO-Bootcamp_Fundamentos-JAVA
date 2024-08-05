package edu.joanna.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV: Ligada? " + smartTv.ligada);
        System.out.println("TV: Canal: " + smartTv.canal);
        System.out.println("TV: Volume: " + smartTv.volume);

        smartTv.ligar();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
    }
}
