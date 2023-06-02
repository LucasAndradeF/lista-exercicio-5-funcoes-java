import java.util.Scanner;

public class ProgramaInversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inversor inversor = new Inversor();

        System.out.println("Inversor de Números");

        System.out.println("Informe um número:");
        inversor.setValorUm(scanner.nextInt());
        scanner.close();

        int resultado = inversor.inverterNumero();
        System.out.println("O Número Invertido é: " + resultado);
    }
}