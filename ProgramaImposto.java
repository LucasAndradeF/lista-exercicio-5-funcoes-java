import java.util.Scanner;

public class ProgramaImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Imposto imposto = new Imposto();

        System.out.println("Programa Imposto");

        System.out.println("Informe o custo do produto:");
        imposto.setCusto(scanner.nextDouble());

        System.out.println("Informe o valor da taxa de imposto do produto:");
        imposto.setTaxaImposto(scanner.nextDouble());
        scanner.close();

        double valorFinal = imposto.somarImposto(imposto.getTaxaImposto(), imposto.getCusto());
        System.out.println("O valor final do produto é: " + valorFinal);
    }
    
}
