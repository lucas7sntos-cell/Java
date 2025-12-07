public class ingressoFamilia extends ingresso {
    private int numeroPessoas;

    public ingressoFamilia(double valor, String nomeFilme, boolean dublado, int numeroPessoas) {
        super(valor, nomeFilme, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * numeroPessoas * 0.95; 
        if (numeroPessoas > 3  ) {
           total *= 0.95;
        }
        return total;
    }


}
