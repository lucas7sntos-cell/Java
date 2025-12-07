package Projetos.ControleGastosMensais;

public class Main {
    public static void main(String[] args) {
        Alimentacao alimento = new Alimentacao("Arroz", 20.0);
        SaudeBemEstar suplemento = new SaudeBemEstar("Vitaminas", 75.0);
        Vestuario roupa = new Vestuario("Camiseta", 50.0);
        Cultura livro = new Cultura("Livro de Java", 100.0);
       
        exibirInfo(alimento, alimento.calcularImposto(alimento.preco));
        exibirInfo(suplemento, suplemento.calcularImposto(suplemento.preco));
        exibirInfo(roupa, roupa.calcularImposto(roupa.preco));
        exibirInfo(livro, livro.calcularImposto(livro.preco));
    }

    public static void exibirInfo(Produto produto, double imposto) {
        produto.exibirValorComImposto(imposto);
    }
}
