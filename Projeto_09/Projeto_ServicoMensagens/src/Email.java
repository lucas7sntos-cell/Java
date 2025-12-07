package Projetos.ServicoBasicoDeMensagens;

public class Email implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }

}
