public class Conversor {
    private double temperaturaF;

    public double getTemperaturaF() {
        return temperaturaF;
    }

    public void setTemperaturaF(double temperaturaF) {
        this.temperaturaF = temperaturaF;
    }

    public double converterTemperatura(double temperaturaC) {
        return temperaturaC = (temperaturaF - 32) / 1.8;
    }


}
