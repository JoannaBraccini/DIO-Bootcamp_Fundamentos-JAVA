package apps;

public class Telegram extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMsg();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }

}
