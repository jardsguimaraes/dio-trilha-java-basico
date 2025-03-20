public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private final double LIMITE_CHEQUE_ESPECIAL;
    private final double TARIFA_CHEQUE_ESPECIAL = 0.20;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
        this.LIMITE_CHEQUE_ESPECIAL = (saldo <= 500.0) ? 50.0 : saldo/2;
        this.chequeEspecial = LIMITE_CHEQUE_ESPECIAL;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return LIMITE_CHEQUE_ESPECIAL;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso!%n", valor);
    }

    public void sacar(double valor){
        realizarOperacao(valor, "saque");
    }

    public void pagarBoleto(double valor){
        realizarOperacao(valor, "Pagamento de Boleto");
    }

    private void realizarOperacao(double valor, String operacao){
        if (valor <= saldo){
            saldo -= valor;
            System.out.printf("%s de R$ %.2f realizado com sucesso!%n", operacao, valor);
        }else if (valor <= saldo + chequeEspecial){
            double usoChequeEspecial = valor - saldo;
            double tarifaChequeEspecial = usoChequeEspecial * TARIFA_CHEQUE_ESPECIAL;
            chequeEspecial -= (usoChequeEspecial + tarifaChequeEspecial);
            saldo = 0;
            System.out.printf("%s de R$ %.2f realizado com sucesso, utilizando o Cheque Especial!%n", operacao, valor);
        }else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public boolean usandoChequeEspecial(){
        return saldo == 0 && chequeEspecial < LIMITE_CHEQUE_ESPECIAL;
    }

}
