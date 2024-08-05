public class SistemaCadastro {
    public static void main(String[] args) {
        // criar pessoa no sistema:
        Pessoa marcos = new Pessoa("123456", "Marcos");

        // definir endereço:
        marcos.setEndereco("Rua das Marias");

        // imprimir:
        System.out.println(marcos.getNome() + " - " + marcos.getCpf());

    }

}
