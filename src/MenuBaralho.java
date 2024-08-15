import java.util.Scanner;

public class MenuBaralho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baralho baralho = new Baralho();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Embaralhar o baralho");
            System.out.println("2. Distribuir uma carta");
            System.out.println("3. Verificar se há cartas no baralho");
            System.out.println("4. Imprimir baralho");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    baralho.embaralhar();
                    System.out.println("O baralho foi embaralhado.");
                    break;
                case 2:
                    Carta carta = baralho.distribuirCarta();
                    if (carta != null) {
                        System.out.println("Carta distribuída: " + carta);
                    } else {
                        System.out.println("Não há mais cartas no baralho.");
                    }
                    break;
                case 3:
                    if (baralho.hasCarta()) {
                        System.out.println("Ainda há cartas no baralho.");
                    } else {
                        System.out.println("Não há mais cartas no baralho.");
                    }
                    break;
                case 4:
                    System.out.println("Cartas no baralho:");
                    baralho.imprimirBaralho();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}