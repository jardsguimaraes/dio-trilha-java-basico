public class Carro {
    private boolean ligado = false;
    private int marcha = 0;
    private int velocidade = 0;
    private final int VELOCIDADE_MAXIMA = 120;
    private final int VELOCIDADE_MINIMA = 0;
    private final int MARCHA_INICIAL = 0;
    private final int MARCHA_FINAL = 6;
    

    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando o carro...");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (estarLigado() && marcha == 0) {
            System.out.println("Desligando o carro...");
            ligado = false;
        }

        if (marcha != 0) {
            System.out.println("O Carro só pode ser desligado se estiver em ponto morto (marcha 0)");

        }
    }

    public void acelerar() {
        if (estarLigado()) {
            if (marcha == 0) {
                System.out.println("Você não pode acelerar em ponto morto. Engate a primeira marcha.");
                return;
            }

            velocidade++;
            if (velocidade <= VELOCIDADE_MAXIMA) {
                if (!verificarCambio()) {
                    velocidade--;
                    System.out.printf("É necessário engatar a macha %d%n!", marcha+1);
                }

                System.out.printf("Acelerando... Velocidade: %d km/h%n", velocidade);
            } else {
                System.out.println("Velocidade máxima atingida.");
                velocidade--;
            }
        }
    }

    public void diminuir() {
        if (estarLigado()) {
            if (marcha == 0) {
                System.out.println("O carro já esta parado");
                return;
            }
            velocidade--;
            if (velocidade >= VELOCIDADE_MINIMA) {
                if (!verificarCambio()) {
                    velocidade++;
                    System.out.printf("É necessário engatar a macha %d%n!", marcha-1);
                }

                System.out.printf("Diminuindo... Velocidade: %d km/h%n", velocidade);
            }else {
                System.out.println("O carro já esta parado");
                velocidade++;
            }
        }
    }

    public void virar(String direcao) {
        if (estarLigado()) {
            if (velocidade > 40) {
                System.out.println("Para virar reduza a velocidade abaixo de 41 km/h");
                return;
            }

            System.out.printf("Carro virando para %s", direcao);
        } else {
            System.out.println("Não pode virar o carro com ele parado");
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean estarLigado() {
        if (!ligado) {
            System.out.println("O carro está desligado.");
        }
        return ligado;
    }

    public void trocarMarcha(int novaMarcha){
        int subirMacha = marcha + 1;
        int descerMarcha = marcha - 1;
        if ((novaMarcha >= MARCHA_INICIAL && novaMarcha <= MARCHA_FINAL) && ((novaMarcha == subirMacha) || (novaMarcha == descerMarcha))) {
            marcha = novaMarcha;
            System.out.printf("Engatada a marcha %d%n", marcha);
        } else {
            System.out.println("Marcha inválida.");
            
        }
    }

    @Override
    public String toString() {
        String statusCarro = ligado ? "Ligado" : "Desligado";
        String mensagem = """
                =====================
                Status do Carro: %s
                Velocidade Atual: %d
                Marcha Atual: %d
                =====================
                """;
        return String.format(mensagem, statusCarro, velocidade, marcha);
    }

    private boolean verificarCambio() {
        boolean marchaValida = true;
        if (velocidade == VELOCIDADE_MINIMA && marcha == 0) {
            marcha = 0;
        } else if ((velocidade >= VELOCIDADE_MINIMA && velocidade <= 20) && marcha == 1) {
            marcha = 1;
        } else if ((velocidade > 20 && velocidade <= 40) && marcha == 2) {
            marcha = 2;
        } else if ((velocidade > 40 && velocidade <= 60) && marcha == 3) {
            marcha = 3;
        } else if ((velocidade > 60 && velocidade <= 80) && marcha == 4) {
            marcha = 4;
        } else if ((velocidade > 80 && velocidade <= 100) && marcha == 5) {
            marcha = 5;
        } else if ((velocidade > 100 &&  velocidade <= VELOCIDADE_MAXIMA && marcha == 6)) {
            marcha = 6;
        } else {
            marchaValida = false;
            System.out.println("Marcha inválida para a velocidade atual.");
        }
        return marchaValida;
    }
}
