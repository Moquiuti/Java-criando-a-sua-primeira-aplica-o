import java.util.Scanner;

public class TabuadaDoDia {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.print("Digite um numero para ver a tabuada: ");
            int numero = leitura.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}

