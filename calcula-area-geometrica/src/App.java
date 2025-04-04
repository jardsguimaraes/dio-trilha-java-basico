import java.util.Scanner;

public class App {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcao = -1;
        var sair = false;

        while (!sair) {
            System.out.println("Escolha uma forma geometrica para calcular a área: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retangulo");
            System.out.println("3 - Circulo");
            System.out.println("4 - sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1 -> createSquare();
                case 2 -> createRectangle();
                case 3 -> createCircle();
                case 4 -> sair = isSair();
                default -> System.out.println("Opcao invalida!");
            }
        }
    }

    private static void createSquare() {
        System.out.println("Digite o lado do quadrado: ");
        double lado = input.nextDouble();
        var quadrado = new Square(lado);
        System.out.println("A area do quadrado é: " + quadrado.area());
    }

    private static void createRectangle() {
        System.out.println("Digite a altura do retangulo: ");
        double altura = input.nextDouble();
        System.out.println("Digite a base do retangulo: ");
        double base = input.nextDouble();
        var retangulo = new Rectangle(altura, base);
        System.out.println("A area do retangulo é: " + retangulo.area());
    }

    private static void createCircle() {
        System.out.println("Digite o raio do circulo: ");
        double raio = input.nextDouble();
        var circulo = new Circle(raio);
        System.out.println("A area do circulo é: " + circulo.area());
    }

    private static boolean isSair() {
        System.out.println("Saindo...");
        return true;
    }
}
