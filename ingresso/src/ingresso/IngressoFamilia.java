package ingresso;

public class IngressoFamilia extends Ingresso {

    private int numeroPessoas;

    public IngressoFamilia(String nome, double valor, boolean dublado, int numeroPessoas) {
        super(nome, valor, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    @Override
    public double calcularValorReal() {
        double valorFinal = valor * numeroPessoas;

        if (numeroPessoas > 3) {
            valorFinal *= 0.95;
        }

        return valorFinal;
    }
}
