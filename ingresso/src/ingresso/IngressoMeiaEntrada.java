package ingresso;

public class IngressoMeiaEntrada extends Ingresso {

    public IngressoMeiaEntrada(String nome, double valor, boolean dublado) {
            super(nome, valor, dublado);
        }

    @Override
    public double calcularValorReal() {
        return valor / 2;
    }
}
