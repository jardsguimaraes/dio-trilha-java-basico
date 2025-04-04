import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcao = -1;
        var sair = false;

        while (!sair) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Vestuário");
            System.out.println("3 - Saúde e Bem Estar");
            System.out.println("4 - Cultura");
            System.out.println("5 - Sair");

            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> alimentacao();
                case 2 -> vestuario();
                case 3 -> saudeBemEstar();
                case 4 -> cultura();
                case 5 -> sair = isSair();
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }

    private static void alimentacao() {
        System.out.println("Digite o valor do produto: ");
        double valorProduto = input.nextDouble();
        var valorProdutoComImposto = new Alimentacao().calcularImposto(valorProduto);
        System.out.printf("Valor do produto com imposto: %.2f%n", valorProdutoComImposto);
    }

    private static void vestuario() {
        System.out.println("Digite o valor do produto: ");
        double valorProduto = input.nextDouble();
        var valorProdutoComImposto = new Vestuario().calcularImposto(valorProduto);
        System.out.printf("Valor do produto com imposto: %.2f%n", valorProdutoComImposto);
    }

    private static void saudeBemEstar() {
        System.out.println("Digite o valor do produto: ");
        double valorProduto = input.nextDouble();
        var valorProdutoComImposto = new SaudeBemEstar().calcularImposto(valorProduto);
        System.out.printf("Valor do produto com imposto: %.2f%n", valorProdutoComImposto);
    }

    private static void cultura() {
        System.out.println("Digite o valor do produto: ");
        double valorProduto = input.nextDouble();
        var valorProdutoComImposto = new Cultura().calcularImposto(valorProduto);
        System.out.printf("Valor do produto com imposto: %.2f%n", valorProdutoComImposto);
    }

    private static boolean isSair() {
        System.out.println("saindo...");
        return true;
    }
}
