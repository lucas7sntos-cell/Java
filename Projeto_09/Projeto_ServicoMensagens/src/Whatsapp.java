package Projetos.ServicoBasicoDeMensagens;

public class Whatsapp implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
    }

}
