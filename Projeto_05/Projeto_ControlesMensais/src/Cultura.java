package Projetos.ControleGastosMensais;

public class Cultura extends Produto implements Tributo {

    public Cultura( String nome, double preco ) {
        super( nome, preco );
    }

    @Override
    public double calcularImposto( double valor ) {
        return preco * 0.04;
    }

}
