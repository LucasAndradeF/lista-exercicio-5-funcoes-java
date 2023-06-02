import java.util.Scanner;

public class ProgramaConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversor conversor = new Conversor();

        System.out.println("Conversor de Temperatura");        
        
        System.out.println("Informe a Temperatura em °F: ");
        conversor.setTemperaturaF(sc.nextDouble());
        
        double temperaturaConvertida = conversor.converterTemperatura(0);
        System.out.printf("A temperatura é: %.2f °C\n" , temperaturaConvertida);
        sc.close();  
    }
}
