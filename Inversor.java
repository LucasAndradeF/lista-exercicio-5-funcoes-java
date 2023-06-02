public class Inversor {
    private int valorUm;

    public int getValorUm() {
        return valorUm;
    }

    public void setValorUm(int valorUm) {
        this.valorUm = valorUm;
    }
  
    public int inverterNumero() {
        return valorUm = Integer.parseInt(new StringBuilder(String.valueOf(valorUm)).reverse().toString());
    }
}
