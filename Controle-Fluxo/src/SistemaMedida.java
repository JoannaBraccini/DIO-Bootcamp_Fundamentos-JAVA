public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;

            default:
                System.out.println("Indefinido");
                break;
        }
    }
}
// switch case que não substitui o if else com benefício, ver PlanoOperadora
// para uma boa implementação de switch case