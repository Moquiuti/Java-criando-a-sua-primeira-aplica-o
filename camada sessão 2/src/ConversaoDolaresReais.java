public class ConversaoDolaresReais {
    public static void main(String[] args) {
        double valorEmDolares = 25.0;
        double cotacaoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.printf("Conversao: US$ %.2f = R$ %.2f%n", valorEmDolares, valorEmReais);
    }
}

