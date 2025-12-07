
import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("informe o seu peso(kg):");
        double peso = scanner.nextDouble();
        System.out.println("informe a sua altura(m):");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("seu imc é %.2f \n", imc);
    

        if (imc < 18.5) {
            System.out.println("você está abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("você está com peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("você está levemente acima do peso");
        } else if (imc >= 30 && imc < 35) {
            System.out.println("você está com obesidade grau I");
        } else if (imc >= 35 && imc < 40) {
            System.out.println("você está com obesidade grau II(Severa)");
        } else {
            System.out.println("você está com obesidade mórbida");
        }
        scanner.close();
    }
}
