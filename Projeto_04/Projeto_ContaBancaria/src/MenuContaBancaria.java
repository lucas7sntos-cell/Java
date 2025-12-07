
import java.util.Scanner;

public class MenuContaBancaria {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) { 
        System.out.println("Valor do depósito inicial");
        double depositoinicial = scanner.nextDouble();
        
        ContaBancaria conta = new ContaBancaria(depositoinicial);   
    
        var option = -1;

        do{
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial ");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - sair");

            option = scanner.nextInt();   

        switch (option) {
            case 1:
            System.out.println("Saldo : R$ " + conta.consultarSaldo());
            break;
            case 2:
            System.out.println("Cheque especial disponivel: " + conta.consultarChequeEspecial());
            break;
            case 3:
            System.out.println("Valor do depósito: " );
            conta.depositar(scanner.nextDouble());
            break;
            case 4:
            System.out.println("Valor do saque: ");
            conta.Sacar(scanner.nextDouble());
            break;
            case 5:
            System.out.println("Valor do boleto: ");
            conta.pagarBoleto(scanner.nextDouble());
            break;
            case 6:
            System.out.println(conta.usandoChequeEspeacial()
            ? "Você está usando cheque especial."
            :"Você não está usando cheque especial.");
            break;
            default:
            System.out.println("Exit!!");

        }

       }while (option != 0);
}    

}   
}