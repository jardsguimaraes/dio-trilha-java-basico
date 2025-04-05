import model.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphone = new IPhone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música 1");

        iphone.exibirPagina("https://web.dio.me/home");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
