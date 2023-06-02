public class ValidarNumero {
    private double valorUm;
    
    public double getValorUm() {
        return valorUm;
    }

    public void setValorUm(double valorUm) {
        this.valorUm = valorUm;
    }
   
    public String validar() {
        if (valorUm > 0) {
            return "P";
        } else { 
            return "N";
               
        }
    }
}