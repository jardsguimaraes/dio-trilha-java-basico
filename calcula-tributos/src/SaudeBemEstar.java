public class SaudeBemEstar implements Produto {

    private final double imposto = 0.015;

    @Override
    public double calcularImposto(double valorProduto) {
        return valorProduto += valorProduto * imposto;
    }
}
