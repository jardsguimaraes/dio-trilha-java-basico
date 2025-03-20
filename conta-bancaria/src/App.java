import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    private static ContaBancaria conta;

    public static void main(String[] args) throws Exception {
        int opcao;

        do {
            exibirMenu();
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1 -> criarConta();
                case 2 -> consultarSaldo();
                case 3 -> depositar();
                case 4 -> sacar();
                case 5 -> pagarBoleto();
                case 6 -> consultarChequeEspecial();
                case 7 -> verificarUsoChequeEspecial();
                case 8 -> sair();
                default -> System.out.println("Opção inválida");
            }
        } while (true);
    }

    private static void exibirMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1 - Criar Conta Bancária");
        System.out.println("2 - Consultar Saldo");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sacar");
        System.out.println("5 - Pagar Boleto");
        System.out.println("6 - Consultar Cheque Especial");
        System.out.println("7 - Verificar uso do Cheque Especial");
        System.out.println("8 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void criarConta() {
        System.out.println("Digite o saldo inicial da conta:");
        double saldoInicial = input.nextDouble();

        saldoInicial = validaInput(saldoInicial);
        conta = new ContaBancaria(saldoInicial);
        System.out.println("Conta criada com sucesso!");
    }

    private static void consultarSaldo() {
        if (contaCriada()) {
            System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
        }
    };

    private static void depositar() {
        if (contaCriada()) {
            System.out.println("Digite o valor do depósito:");
            double valor = input.nextDouble();

            valor = validaInput(valor);
            conta.depositar(valor);
        }
    }

    private static void sacar() {
        if (contaCriada()) {
            System.out.println("Digite o valor do saque:");
            double valor = input.nextDouble();

            valor = validaInput(valor);
            conta.sacar(valor);
        }
    }

    private static void pagarBoleto() {
        if (contaCriada()) {
            System.out.println("Digite o valor do boleto:");
            double valor = input.nextDouble();

            valor = validaInput(valor);
            conta.pagarBoleto(valor);
        }
    }

    private static void consultarChequeEspecial() {
        if (contaCriada()) {
            System.out.printf("Limite do Cheque Especial: R$ %.2f%n", conta.getLimiteChequeEspecial());
            System.out.printf("Cheque Especial disponível: R$ %.2f%n", conta.getChequeEspecial());
        }
    }

    private static void verificarUsoChequeEspecial() {
        if (contaCriada()) {
            String mensagem = conta.usandoChequeEspecial() ? "O Cheque Especial está sendo utilizado!" : "O Cheque Especial não está sendo utilizado.";
            System.out.println(mensagem);
        }
    }

    private static void sair() {
        System.out.println("Saindo...");
        System.exit(0);
    }

    private static boolean contaCriada() {
        if (conta == null){
            System.out.println("Conta não criada ainda.");
            return false;
        }
        return true;
    }

    private static double validaInput(double valor) {
        while (valor <= 0) {
            {
                System.out.println("Valor inválido! Digite um valor maior que zero:");
                valor = input.nextDouble();
            }
        }

        return valor;
    }
}