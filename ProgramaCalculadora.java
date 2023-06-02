import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
                        
        System.out.println("Calculadora");

        System.out.println("Informe o primeiro número:");
        calculadora.setNumeroUm(sc.nextDouble());

        System.out.println("Informe o segundo número:");
        calculadora.setNumeroDois(sc.nextDouble());

        System.out.println("Informe o terceiro número:");
        calculadora.setNumeroTres(sc.nextDouble());
        sc.close();
            
        double resultadoMediaAritmetica = calculadora.mediaAritmetica();
        System.out.printf("A média Aritmetica é: %.2f\n" , resultadoMediaAritmetica);
            
        double resultadoMediaHarmonica = calculadora.mediaHarmonica();
        System.out.printf("A média Harmônica é: %.2f\n" , resultadoMediaHarmonica);

        double resultadoMediaGeometrica = calculadora.mediaGeometrica();
        System.out.printf("A média é Geométrica: %.2f\n" , resultadoMediaGeometrica);
    }
}


