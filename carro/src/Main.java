import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static Carro carro = new Carro();

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> ligarCarro();//
                case 2 -> desligarCarro();//
                case 3 -> acelerar();//
                case 4 -> diminuirVelocidade();//
                case 5 -> virar();
                case 6 -> verificarVelocidadeAtual();//
                case 7 -> trocarMarcha();//
                case 8 -> computadorDeBordo();//
                case 9 -> sair();//
                default -> System.out.println("Opção inválida");//
            }
        } while (true);
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1 - Ligar Carro");
        System.out.println("2 - Desligar Carro");
        System.out.println("3 - Acelerar");
        System.out.println("4 - Diminuir Velocidade");
        System.out.println("5 - Virar para Esquerda/Direita");
        System.out.println("6 - Verificar Velocidade Atual");
        System.out.println("7 - Trocar Marcha");
        System.out.println("8 - Informações do Computador de Bordo");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void ligarCarro() {

        carro.ligar();
    }

    private static void desligarCarro() {

        carro.desligar();
    }

    private static void acelerar() {
        carro.acelerar();

    }

    private static void diminuirVelocidade() {
        carro.diminuir();
    }

    private static void virar() {
        String direcao;

        do {
            System.out.println("Qual a direção desejada Esquerda(E) ou Direita(D)");
            direcao = input.next();

            if ("e".equalsIgnoreCase(direcao) || "d".equalsIgnoreCase(direcao)) {
                direcao = "e".equalsIgnoreCase(direcao) ? "Esquerda" : "Direita";
                break;
            }
            System.out.println("Opção invalida!");
        } while (true);

        carro.virar(direcao);

    }

    private static void verificarVelocidadeAtual() {
        System.out.printf("Velocidade Atual: %d%n%n",carro.getVelocidade());
    }

    private static void trocarMarcha() {
        System.out.println("Digite a marcha desejada: ");
        int novaMarcha = input.nextInt();
        carro.trocarMarcha(novaMarcha);
    }

    private static void computadorDeBordo() {
        System.out.println(carro);
    }

    private static void sair() {
        System.out.println("Saindo...");
        System.exit(0);
    }
}
