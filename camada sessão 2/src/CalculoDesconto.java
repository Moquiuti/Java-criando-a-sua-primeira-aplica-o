public class CalculoDesconto {
    public static void main(String[] args) {
        double precoOriginal = 150.0;
        double percentualDesconto = 10.0;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double novoPreco = precoOriginal - valorDesconto;

        System.out.printf("Preco com desconto: R$ %.2f (desconto de %.0f%%)%n", novoPreco, percentualDesconto);
    }
}

