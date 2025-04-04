public class Alimentacao implements Produto {

    private final double imposto = 0.01;

    @Override
    public double calcularImposto(double valorProduto) {
        return valorProduto += valorProduto * imposto;
    }
}
