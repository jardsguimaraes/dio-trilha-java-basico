package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    private static final double SALARIO_BASE = 2_000.0;
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Marcos", "Paula", "Pedro", "Lucas", "Mariana"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        String[] selecionados = new String[5];
        String[] preSelecionados = new String[5];
        int quantidadePreSelecionada = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            // Condicional para priorizar candidatos com salário pretendido menor que o salário base
            if (SALARIO_BASE > salarioPretendido) {
                selecionados[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            } else if (SALARIO_BASE == salarioPretendido) {
                preSelecionados[quantidadePreSelecionada] = candidato;
                quantidadePreSelecionada++;
            }

            candidatoAtual++;
        }

        System.out.println("Candidadtos selecionados: " + candidatosSelecionados);
        System.out.println("tamanho Array selecionados: " + selecionados.length);

        if (candidatosSelecionados < 5) {
            for (int i = 0; i < quantidadePreSelecionada; i++) {
                selecionados[candidatosSelecionados] = preSelecionados[i];
                candidatosSelecionados++;

                if (candidatosSelecionados == 5) {
                    break;
                }
            }
        }

        imprimirSelecionados(selecionados);
    }

    static void imprimirSelecionados(String[] selecionados){
        System.out.println("Candidatos Selecionados: ");

        for (String candidatoSelecionado : selecionados) {
            if (candidatoSelecionado != null) {
                entrandoEmContato(candidatoSelecionado);
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1_500.0,3_000.0);
    }

    static void analisarCandidato(double salarioPretendido){

        if (SALARIO_BASE > salarioPretendido) {
            System.out.println("Ligar para candidato!!!");
        } else if (SALARIO_BASE == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta!!!");
        } else {
            System.out.println("Aguardando Resultados dos Demais Candidatos!!!");
        }
    }

    static boolean LigarCandidato() {
        return new Random().nextInt(3) == 1;
    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean atendeu = false;

        do {
            atendeu = LigarCandidato();
            if (!atendeu) {
                tentativas++;
            } else {
                System.out.println("Contato realizado com sucesso!!!");
            }
        } while (!atendeu && tentativas <= 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativas + "ª tentativa!!!");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + " número máximo de tentativas " + (tentativas - 1) + " realizada!!!");
        }
    }
}
