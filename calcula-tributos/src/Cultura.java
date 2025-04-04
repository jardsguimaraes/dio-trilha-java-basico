public class Cultura implements Produto {

    private final double imposto = 0.04;

    @Override
    public double calcularImposto(double valorProduto) {
        return valorProduto += valorProduto * imposto;
    }
}
