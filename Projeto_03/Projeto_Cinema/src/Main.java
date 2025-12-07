
public class Main {

    public static void main(String[] args) {
        Gerente g = new Gerente("Lucas", "lukinhas.7santos@gmail.com", "123456");
        g.realizarLogin();
        g.gerarRelatorioFinanceiro();
        System.out.println("----------------------");

        Vendedor v = new Vendedor("bianca", "naoseioq@gmail.com", "654321");
        v.realizarLogin();
        v.realizarLogoff();
        v.consultarVendas();
        System.out.println("----------------------");

        Atendente a = new Atendente("Carlos", "carlos@empresa.com", "abcdef");
        a.realizarLogin();
        a.receberPagamento(150.0);
        a.fecharCaixa();
        System.out.println("----------------------");
    }
}
    
