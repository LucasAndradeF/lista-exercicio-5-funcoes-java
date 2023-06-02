public class Calculadora {
    private double numeroUm;
    private double numeroDois;
    private double numeroTres;
    
    public double getNumeroUm() {
      return numeroUm;
    }

    public void setNumeroUm(double numeroUm) {
      this.numeroUm = numeroUm;
    }

    public double getNumeroDois() {
      return numeroDois;
    }

    public void setNumeroDois(double numeroDois) {
      this.numeroDois = numeroDois;
    }

    public double getNumeroTres() {
      return numeroTres;
    }

    public void setNumeroTres(double numeroTres) {
      this.numeroTres = numeroTres;
    }

    public double mediaAritmetica() { 
      if (numeroTres != 0) {
        return (numeroUm + numeroDois + numeroTres) / 3;
      } else {
        return (numeroUm + numeroDois) / 2;
      }
    }

    public double mediaHarmonica() {
      return 3 / ((1 / numeroUm) + (1 / numeroDois) + (1 / numeroTres));
    }
  
    public double mediaGeometrica() {
      return Math.cbrt(numeroUm * numeroDois * numeroTres);
    }

    public double somar() {
      return numeroUm + numeroDois + numeroTres;
    }
}