import java.util.Scanner;

import exception.ParametrosInvalidosException;

public class Contador {

	private static final String ANSI_RED = "\u001B[31m";
	private static final String ANSI_RESET = "\u001B[0m";
	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			boolean entradaValida = false;

			while (!entradaValida) {
				try {
					System.out.println("Digite o primeiro parâmetro");
					int parametroUm = input.nextInt();
	
					System.out.println("Digite o segundo parâmetro");
					int parametroDois = input.nextInt();
	
					contar(parametroUm, parametroDois);
					entradaValida = true;
					
				} catch (ParametrosInvalidosException e) {
					System.out.println(ANSI_RED + "\nErro: " + ANSI_RESET + e.getMessage());
					System.out.println("Tente novamente.\n");
				} catch (Exception e) {
					System.out.println(ANSI_RED + "\nEntrada inválida! Digite apenas números." + ANSI_RESET);
					input.nextLine(); // Limpa o buffer do teclado
				}
			}
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}

		int contagem = parametroDois - parametroUm;
		for (int i = 0; i < contagem; i++) {
			System.out.printf("Imprimindo o número %d%n", (i + 1));
		}
	}
}