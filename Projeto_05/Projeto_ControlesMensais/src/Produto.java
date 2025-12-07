package Projetos.ControleGastosMensais;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirValorComImposto(double imposto) {
        System.out.println(nome + " | Preço : R$ " + preco +
                " | imposto: R$ " + imposto +
                " | Total : R$ " + (preco + imposto));

    }
}
