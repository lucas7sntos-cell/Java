public class Cinema {
    public static void main(String[] args) {
        ingresso comum = new ingresso(30.0, "Como treinar seu dragão", true);
        ingresso meia = new MeiaEntrada(30.0, "Aquamen", false);
        ingresso familia = new ingressoFamilia(30.0, "Guardiôes da galáxia Vol.3", true, 4);
        
    
    comum.exibirInfo();
    meia.exibirInfo();
    familia.exibirInfo();
}
    
}