package apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void salvarHistoricoMsg() {
        System.out.println("Salvando histórico de mensagens...");
    };

    protected void validarConexao() {
        System.out.println("Verificando conexão de internet...");
    }
}
