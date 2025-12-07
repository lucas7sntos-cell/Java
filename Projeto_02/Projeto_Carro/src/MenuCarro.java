
import java.util.Scanner;

public class MenuCarro {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var carro = new Carro();
        int opcao;

        do {
            System.out.println("""
            === MENU DO CARRO ===
            1 - Ligar carro
            2 - Desligar carro
            3 - Acelerar
            4 - Frear
            5 - Virar para esquerda
            6 - Virar para direita
            7 - Trocar marcha
            8 - Verificar status
            0 - Sair
            """);

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.frear();
                case 5 -> carro.virar("esquerda");
                case 6 -> carro.virar("direita");
                case 7 -> {
                    System.out.println("Digite a marcha (0 a 6):");
                    carro.trocarMarcha(scanner.nextInt());
                }
                case 8 -> carro.mostrarStatus();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
}
}