import java.util.Scanner;

public class ProgramaValidacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidarNumero validacao = new ValidarNumero();
        
        System.out.println("Validação de Números Positivo ou Negativo");
        
        System.out.println("Informe um número:");
        validacao.setValorUm(scanner.nextDouble());
        scanner.close();

        String resultado = validacao.validar();
        System.out.println("O número é: " + resultado);
    }
}
