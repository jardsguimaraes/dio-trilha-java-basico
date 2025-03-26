package ingresso;

public abstract class Ingresso {
    protected String nome;
    protected double valor;
    protected boolean dublado;

    protected Ingresso(String nome, double valor, boolean dublado) {
        this.nome = nome;
        this.valor = valor;
        this.dublado = dublado;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean isDublado() {
        return dublado;
    }

    protected abstract double calcularValorReal();

    @Override
    public String toString() {
        return String.format("Nome: %s%nValor: %.2f%nLegendado: %s%n", 
            nome, calcularValorReal(), (dublado ? "Dublado" : "Legendado"));
    }
}
