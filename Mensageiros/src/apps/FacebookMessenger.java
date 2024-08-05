package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMsg();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

}
