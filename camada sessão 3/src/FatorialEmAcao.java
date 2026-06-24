import java.util.Scanner;

public class FatorialEmAcao {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.print("Digite um numero inteiro: ");
            int numero = leitura.nextInt();

            if (numero < 0) {
                System.out.println("Fatorial nao existe para numeros negativos.");
                return;
            }

            long fatorial = 1;
            int contador = numero;

            while (contador > 1) {
                fatorial *= contador;
                contador--;
            }

            System.out.println("Fatorial de " + numero + " = " + fatorial);
        }
    }
}

