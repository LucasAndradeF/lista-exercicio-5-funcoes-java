public class Impressao {
    private int numeroUm;

    public int getnumeroUm() {
        return numeroUm;
    }

    public void setnumeroUm(int numeroUm) {
        this.numeroUm = numeroUm;
    }

    public void contador(int n) {
        System.out.println("A impressão solicitada é:");
            for (int numeroUm = 1; numeroUm <= n; numeroUm++) {
                String linha = "";
                    for (int numeroDois = 0; numeroDois < numeroUm; numeroDois++) {
                        linha += numeroUm + " ";
                    }
                System.out.println(linha);
            }
    }
}
