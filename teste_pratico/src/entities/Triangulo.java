package entities;

public class Triangulo {
    public double autura;
    public double largura;

    public double area(){
        return largura * autura;
    }

    public double perimetro(){
        return 2* (autura + largura);
    }

    public double diagonal(){
        return Math.sqrt((autura * autura) + (largura * largura));
    }

    public Triangulo(double autura, double largura) {
        this.autura = autura;
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Triangulo "+
                "autura=" + autura +
                ", largura=" + largura +
                " Area=" + String.format("%.2f%n", area())+ " Perimetro=" + String.format("%.2f%n", perimetro())+ " Diagonal=" + String.format("%.2f%n", diagonal());
    }
}
