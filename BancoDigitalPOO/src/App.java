public class App {
    public static void main(String[] args) throws Exception {
        Cliente pessoa = new Cliente();
        pessoa.setNome("Jose");

        Conta cc = new ContaCorrente(pessoa);
        cc.depositar(100);
        Conta poup = new ContaPoupanca(pessoa);
        cc.transferir(100, poup);

        cc.imprimirExtrato();
        poup.imprimirExtrato();
    }
}
