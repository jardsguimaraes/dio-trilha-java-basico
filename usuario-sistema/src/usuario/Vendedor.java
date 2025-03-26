package src.usuario;

public class Vendedor extends Usuario {

    private int quantidadeVendas = 0;

    public Vendedor(String nome, String email, String senha) {
            super(nome, email, senha, false);
        }
    
        @Override
    public void realizarLogin() {
        System.out.println("Vendedor logado");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Vendedor deslogado");
    }

    @Override
    public void alterarSenha() {
        System.out.println("Senha do Vendedor alterada");
    }

    @Override
    public void alterarDados() {
        System.out.println("Dados do Vendedor alterado");
    }

    public void realizarVenda() {
        quantidadeVendas++;
    }

    public int consultarVendas() {
        return quantidadeVendas;
    }
}
