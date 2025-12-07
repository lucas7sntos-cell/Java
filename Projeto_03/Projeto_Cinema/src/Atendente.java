public class Atendente extends classeBase {

    private double valorCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorCaixa = 0.0;
    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void receberPagamento(double valor) {
        valorCaixa += valor;
        System.out.println("Pagamento recebido! Caixa atual: " + valorCaixa);
    }

    public void fecharCaixa() {
        System.out.println("Fechando caixa. Valor total: " + valorCaixa);
        valorCaixa = 0;
    }
}