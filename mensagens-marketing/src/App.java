import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        var sair = false;
        int opcao = -1;
        while (!sair) {
            System.out.println("========== Menu ==========");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Enviar mensagem por WhatsApp");
            System.out.println("2 - Enviar mensagem por Email");
            System.out.println("3 - Enviar mensagem por SMS");
            System.out.println("4 - Enviar mensagem por Redes Sociais");
            System.out.println("5 - Sair");
            System.out.println("===========================");
            opcao = input.nextInt();
            input.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1 -> sendWhatsApp();
                case 2 -> sendEmail();
                case 3 -> sendSms();
                case 4 -> sendRedesSociais();
                case 5 -> sair = isSair();
                default -> System.out.println("Opção inválida");
            }
        }
    }

    private static void sendWhatsApp() {
        System.out.println("Digite a messagem a ser enviada:");
        String message = input.nextLine();
        new WhatsApp().send(message);
    }

    private static void sendEmail() {
        System.out.println("Digite a messagem a ser enviada:");
        String message = input.nextLine();
        new Email().send(message);
    }

    private static void sendRedesSociais() {
        System.out.println("Digite a messagem a ser enviada:");
        String message = input.nextLine();
        new RedesSociais().send(message);
    }

    private static void sendSms() {
        System.out.println("Digite a messagem a ser enviada:");
        String message = input.nextLine();
        new Sms().send(message);
    }

    private static boolean isSair() {
        System.out.println("Saindo...");
        return true;
    }
}
