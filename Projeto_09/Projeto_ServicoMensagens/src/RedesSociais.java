package Projetos.ServicoBasicoDeMensagens;

public class RedesSociais implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem pelas Redes Sociais: " + mensagem);
    }

}
