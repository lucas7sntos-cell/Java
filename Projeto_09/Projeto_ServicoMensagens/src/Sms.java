package Projetos.ServicoBasicoDeMensagens;

public class Sms implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }

}
