package Projetos.ServicoBasicoDeMensagens;

public class Main {
    public static void main(String[] args) {
        ServicoMensagem sms = new Sms();
        ServicoMensagem email = new Email();
        ServicoMensagem whatsapp = new Whatsapp();
        ServicoMensagem redesSociais = new RedesSociais();

        sms.enviarMensagem("Olá via SMS!");
        email.enviarMensagem("Olá via Email!");
        whatsapp.enviarMensagem("Olá via WhatsApp!");
        redesSociais.enviarMensagem("Olá via Redes Sociais!");
        
    }
    
}
