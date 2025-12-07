package Projetos.ControleGastosMensais;

public class Alimentacao extends Produto implements Tributo {

    public Alimentacao( String nome, double preco ) {
        super( nome, preco );
    }

    @Override
    public double calcularImposto( double valor ) {
        return preco * 0.01;
    }


}
