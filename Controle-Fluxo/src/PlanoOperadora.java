public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");

            case "M":
                System.out.println("Whats e Instagram grátis");

            case "B":
                System.out.println("100 minutos de ligação");

            default:
                break;
        }
    }
}
// Neste caso, sem o break, o cenário é de complementação, com os elementos em
// ordem de grandeza decrescente.