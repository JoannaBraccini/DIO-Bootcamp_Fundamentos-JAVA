public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("93054110");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde às regras de negócio...");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {

        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado:
        return "93.054-110";

    }
}
