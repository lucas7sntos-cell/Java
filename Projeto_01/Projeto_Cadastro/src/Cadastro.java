

import java.util.Scanner;

public class Cadastro {
  public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);
    
    System.out.println(" escreva o seu nome");
    String nome = scanner.nextLine();
    System.out.println(" escreva o seu cpf");
    String cpf = scanner.nextLine();
    System.out.println(" escreva o seu email");
    String email = scanner.nextLine();

    if (nome.isEmpty() || cpf.isEmpty()  || email.isEmpty())  {
        System.out.println(" cadastro incompleto");
    }
         else if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Cadastro incompleto");
    } else {
        System.out.println(" cadastro validado com sucesso ");
    }
    scanner.close();
  
  }
}