public class Produto {
    private double valorProduto;
    
    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double valorFinal(double valorFinal) {
        return valorFinal = (valorProduto * 0.10) + valorProduto;
    }
}