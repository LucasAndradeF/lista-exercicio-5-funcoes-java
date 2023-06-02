import java.util.Scanner;

public class ProgramaImpressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Impressao impressao = new Impressao();

        System.out.println("Impressão de números");

        System.out.println("Informe o número para impressão:");
        impressao.setnumeroUm(scanner.nextInt());
        scanner.close();
        
        impressao.contador(impressao.getnumeroUm());
    }
}


