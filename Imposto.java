public class Imposto {
    private double custo;
    private double taxaImposto;
        
    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    public double somarImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100); 
    }
} 