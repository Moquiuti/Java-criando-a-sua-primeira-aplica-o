import java.util.Scanner;

public class AreaEmCena {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Calcular area do quadrado");
            System.out.println("2. Calcular area do circulo");
            System.out.print("Opcao: ");
            int opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = leitura.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.printf("Area do quadrado: %.2f%n", areaQuadrado);
                    break;
                case 2:
                    System.out.print("Digite o raio do circulo: ");
                    double raio = leitura.nextDouble();
                    double areaCirculo = Math.PI * raio * raio;
                    System.out.printf("Area do circulo: %.2f%n", areaCirculo);
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }
}

