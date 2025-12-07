public class ingresso {

    protected double valor;
    protected String nomeFilme; 
    protected boolean dublado;

     public ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValorReal() {
        return valor;
    }

    public String getTipoAudio() {
        return dublado ? "Dublado" : "Legendado";
    }

    public void exibirInfo() {
        System.out.println("Filme: " + nomeFilme);
        System.out.println("Idioma: " + getTipoAudio());
        System.out.println("Valor: R$ " + getValorReal());
        System.out.println("---------------------");
    }
}


