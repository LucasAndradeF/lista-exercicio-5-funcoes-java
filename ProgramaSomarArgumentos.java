import java.util.Scanner;

public class ProgramaSomarArgumentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Somar Argumentos");
        
        System.out.println("Informe o primeiro número:");
        calculadora.setNumeroUm(scanner.nextDouble());
        
        System.out.println("Informe o segundo número:");
        calculadora.setNumeroDois(scanner.nextDouble());
        
        System.out.println("Informe o terceiro número:");
        calculadora.setNumeroTres(scanner.nextDouble());
        scanner.close();

        double resultado = calculadora.somar();
        System.out.println("O Resultado é: " + resultado);
    }
}
