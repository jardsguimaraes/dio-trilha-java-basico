package src;

import src.usuario.Atendente;
import src.usuario.Gerente;
import src.usuario.Usuario;
import src.usuario.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario gerente = new Gerente("Jards Guimarães", "jards@teste.com", "123456");
        Usuario vendedor = new Vendedor("Paulo José", "paulo@teste.com", "65321");
        Usuario atendente = new Atendente("Carlos Matias", "carlos@teste.com", "223344");

        System.out.println("======gerente=========");
        exibirInformacoes(gerente);
        ((Gerente) gerente).gerarRelatorio();
        gerente.realizarLogoff();
        System.out.println("\n");

        System.out.println("======Vendedor=========");
        exibirInformacoes(vendedor);
        var vendedor0 = (Vendedor) vendedor;
        for (int i = 0; i < 10; i++) {
            vendedor0.realizarVenda();
        }
        System.out.println(vendedor0.consultarVendas());
        vendedor.realizarLogoff();
        System.out.println("\n");
        
        System.out.println("======Atendente=========");
        exibirInformacoes(atendente);
        var atendente0 = (Atendente) atendente;
        atendente0.receberPagamento(50.50);
        atendente0.receberPagamento(70.25);
        atendente0.receberPagamento(150.0);
        atendente0.fecharCaixa();
        atendente.realizarLogoff();
        System.out.println("\n");
    }

    private static void exibirInformacoes(Usuario usuario) {
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getSenha());
        usuario.realizarLogin();
        usuario.alterarDados();
        usuario.alterarSenha();
    }
}
