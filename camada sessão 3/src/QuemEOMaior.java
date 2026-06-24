import java.util.Scanner;

public class QuemEOMaior {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.print("Digite o primeiro numero inteiro: ");
            int primeiro = leitura.nextInt();

            System.out.print("Digite o segundo numero inteiro: ");
            int segundo = leitura.nextInt();

            if (primeiro == segundo) {
                System.out.println("Os numeros sao iguais.");
            } else if (primeiro > segundo) {
                System.out.println("Os numeros sao diferentes e o primeiro e maior.");
            } else {
                System.out.println("Os numeros sao diferentes e o segundo e maior.");
            }
        }
    }
}

