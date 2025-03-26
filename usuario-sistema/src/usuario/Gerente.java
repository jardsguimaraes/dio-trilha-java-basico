package src.usuario;

public class Gerente extends Usuario {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    @Override
    public void realizarLogin() {
        System.out.println("Administrador logado");
    }

    @Override
    public void realizarLogoff() {
        System.out.println("Administrador deslogado");
    }

    @Override
    public void alterarSenha() {
        System.out.println("Senha do administrador alterada");
    }

    @Override
    public void alterarDados() {
        System.out.println("Dados do administrador alterados");
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatório financeiro");
    }

    public void consultarVendas(Vendedor vendedor) {
        if (vendedor == null) {
            System.out.println("O vendedor não existe");
            return;
        }

        System.out.printf("O vendedor %s possui %d vendas%n", vendedor.getNome(), vendedor.consultarVendas());
    }
}
