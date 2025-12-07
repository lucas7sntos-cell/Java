import java.util.Scanner;
 
public class PAReIMPAR {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero;
    int numero2;
    String escolha ;
   


    System.out.println(" digite o primeiro numero:");
    numero = scanner.nextInt();
    do {
        System.out.println("digite o segundo numero, que deve ser maior que o primeiro:");
         numero2 = scanner.nextInt();
        if (numero2 <= numero) {
            System.out.println("numero inválido, digite novamente.");
        } else {
            System.out.printf("números entre %d e %d são: \n", numero, numero2);
            for (int i = numero + 1; i < numero2; i++) {
                System.out.println(i);
            }
            break;
        }
    } while (true);
    
    do {
        System.out.println(" escolhe entre 'par' ou 'impar':");
        escolha = scanner.next().toLowerCase();
        if (!escolha.equals("par") && !escolha.equals("impar")) {
            System.out.println("escolha inválida, digite novamente.");
        }
    } while (!escolha.equals("par") && !escolha.equals("impar"));
        System.out.println(" \n ------ resultado ------");
        System.out.printf("numeros %s entre %d e %d são: \n", escolha, numero, numero2);
        for (int i = numero + 1; i <= numero2; i++) {
            if (escolha.equals("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equals("impar") && i % 2 != 0) {
                System.out.println(i);
                
            }   
     }
    scanner.close();  


}
}