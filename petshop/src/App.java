import java.util.Scanner;

public class App {
    private static Scanner input = new Scanner(System.in);
    private static PetMachine petMachine = new PetMachine();
    public static void main(String[] args) throws Exception {
        int opcao;

        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo");
            System.out.println("4 - Verificar água na maquina");
            System.out.println("5 - Verificar shampoo na maquina");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet no banho");
            System.out.println("8 - Retirar pet do banho");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 - Sair");
            System.out.println();

            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> petMachine.banhoPet();
                case 2 -> adicionarAguaNaMaquina();
                case 3 -> adicionarShampooNaMaquina();
                case 4 -> verificaAguaNaMaquina();
                case 5 -> verificaShampooNaMaquina();
                case 6 -> verificaPetNaMaquina();
                case 7 -> setPetMachine();
                case 8 -> petMachine.retirarPet();
                case 9 -> petMachine.limpar();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        } while (true);

    }

    private static void adicionarAguaNaMaquina() {
        System.out.println("Tentando adicionar água na máquina");
        petMachine.adicionarAgua();
    }

    private static void adicionarShampooNaMaquina() {
        System.out.println("Tentando adicionar shampoo na máquina");
        petMachine.adicionarShampoo();
    }

    private static void verificaShampooNaMaquina() {
        int quantidade = petMachine.getShampoo();
        System.out.printf("%nA quantidade de shampoo na máquina é %d%n", quantidade);
    }

    private static void verificaAguaNaMaquina() {
        int quantidade = petMachine.getAgua();
        System.out.printf("%nA quantidade de água na máquina é %d%n", quantidade);
    }

    private static void verificaPetNaMaquina() {
        boolean temPet = petMachine.temPet();
        System.out.println(temPet ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    private static void setPetMachine() {
        String nome = "";
        input.nextLine(); // Limpa qualquer entrada pendente no buffer

        while (nome == null || nome.isEmpty()) {
            System.out.println("Digite o nome do pet");
            nome = input.nextLine();
        }

        Pet pet = new Pet(nome);
        petMachine.adicionarPet(pet);
    }
}
