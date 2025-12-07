

import java.util.Scanner;

public class ComparadorSenhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println(" digite sua senha");
        String senhaDigitada = scanner.nextLine();
        System.out.println(" confirme sua senha");
        String senhaConfirmada = scanner.nextLine();

        if (senhaDigitada.equals(senhaConfirmada)) {
            System.out.println(" senha valida");
        } else {
            System.out.println("Senhas nao conferem ");
        }

        scanner.close();

        }

    }

    

