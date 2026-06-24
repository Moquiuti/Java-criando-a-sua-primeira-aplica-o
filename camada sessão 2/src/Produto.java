public class Produto {
    public static void main(String[] args) {
        double precoProduto = 19.90;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;

        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);
    }
}

