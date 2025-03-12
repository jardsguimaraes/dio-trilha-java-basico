import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in).useLocale(Locale.of("pt", "BR"))) {
            System.out.println("Digite o número da conta:");
            int numeroConta = input.nextInt();

            System.out.println("Digite a agência como digito:");
            String agencia = input.next();
            input.nextLine();

            System.out.println("Digite o nome do cliente:");
            String nomeCliente = input.nextLine();

            System.out.println("Digite o saldo inicial:");
            double saldo = input.nextDouble();

            NumberFormat formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
            formatador.setMinimumFractionDigits(2);
            formatador.setMaximumFractionDigits(2);
            String saldoFormatado = formatador.format(saldo);

            System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %s " +
                "já está disponível para saque.%n",
                nomeCliente, agencia, numeroConta, saldoFormatado);
        }
    }
}
