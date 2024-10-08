import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            // executando repetidas vezes até alguém atender:
            System.out.println("Telefone tocando");

        } while (tocando());
        System.out.println("Alô!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;// valor aleatório entre 3 e 1 onde 1 é true
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando:
        return !atendeu;
    }
}
