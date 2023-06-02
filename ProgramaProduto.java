import java.util.Scanner;

public class ProgramaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Valor Final do Produto");
       
        System.out.println("Informe o valor do produto:");
        produto.setValorProduto(sc.nextDouble());

        double resultado = produto.valorFinal(0);
        System.out.printf("Novo valor do Produto: R$ %.2f\n" , resultado);
        sc.close();        
    }
}
