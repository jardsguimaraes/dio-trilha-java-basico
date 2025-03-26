package src.usuario;

public class Atendente extends Usuario {

    private double caixa = 0.0;

    public Atendente(String nome, String email, String senha) {
            super(nome, email, senha, false);
        }
    
        @Override
    public void realizarLogin() {
        System.out.println("Atendente logado");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Atendente deslogado");
    }

    @Override
    public void alterarSenha() {
        System.out.println("Senha do Atendente alterada");
    }

    @Override
    public void alterarDados() {
        System.out.println("Dados do Atendente alterado");
    }

    public void receberPagamento(double valor) {
        caixa += valor;
    }

    public void fecharCaixa() {
        System.out.printf("Fechando do caixa: %.2f%n", caixa);
    }
}
