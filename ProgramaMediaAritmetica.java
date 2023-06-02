import java.util.Scanner;

public class ProgramaMediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Média Aritmética");

        System.out.println("Informe o primeiro número:");
        calculadora.setNumeroUm(sc.nextDouble());

        System.out.println("Informe o segundo número:");
        calculadora.setNumeroDois(sc.nextDouble());
        sc.close();

        double resultado = calculadora.mediaAritmetica();
        System.out.println("A Média Aritmética: " + resultado);
    }
    
}
