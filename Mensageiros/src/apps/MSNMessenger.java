package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo MSN Messenger");
        salvarHistoricoMsg();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }

}
