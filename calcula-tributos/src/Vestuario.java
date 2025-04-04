public class Vestuario implements Produto {

    private final double imposto = 0.025;

    @Override
    public double calcularImposto(double valorProduto) {
        return valorProduto += valorProduto * imposto;
    }
}
