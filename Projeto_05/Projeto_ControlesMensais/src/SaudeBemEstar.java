package Projetos.ControleGastosMensais;

public class SaudeBemEstar extends Produto implements Tributo {

    public SaudeBemEstar( String nome, double preco ) {
        super( nome, preco );
    }

    @Override
    public double calcularImposto( double valor ) {
        return preco * 0.015;
    }

}
