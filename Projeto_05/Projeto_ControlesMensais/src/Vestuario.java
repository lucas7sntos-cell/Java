package Projetos.ControleGastosMensais;

public class Vestuario extends Produto implements Tributo {

    public Vestuario( String nome, double preco ) {
        super( nome, preco );
    }

    @Override
    public double calcularImposto( double valor ) {
        return preco * 0.025;
    }

}
