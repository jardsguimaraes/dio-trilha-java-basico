import ingresso.Ingresso;
import ingresso.IngressoFamilia;
import ingresso.IngressoMeiaEntrada;

public class App {
    public static void main(String[] args) throws Exception {
        Ingresso ingressoMeiaEntradaAvengers = new IngressoMeiaEntrada("The Avengers", 50.0, true);
        Ingresso ingressoMeiaEntradaBlood = new IngressoMeiaEntrada("Blood", 30.50, false);
        Ingresso ingressoFamiliaAvengers = new IngressoFamilia("The Avengers", 50.0, true, 4);
        Ingresso ingressoFamiliaBlood = new IngressoFamilia("Blood", 30.5, false, 2);

        System.out.println("Ingresso Meia Entrada");
        System.out.println(ingressoMeiaEntradaAvengers);
        System.out.println(ingressoMeiaEntradaBlood);
        System.out.println("Ingresso Familia");
        System.out.println(ingressoFamiliaAvengers);
        System.out.println(ingressoFamiliaBlood);
    }
}
