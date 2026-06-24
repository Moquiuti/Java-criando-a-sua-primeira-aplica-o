import java.util.Scanner;

public class SinalDoNumero {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.print("Digite um numero: ");
            double numero = leitura.nextDouble();

            if (numero >= 0) {
                System.out.println("Numero positivo");
            } else {
                System.out.println("Numero negativo");
            }
        }
    }
}

