package entities;

public class Funcionario {
    public String name;
    public double salarioBruto;
    public double tax;
    public double salarioLiq;

    public double salarioLiquido(){
        salarioLiq = salarioBruto - tax;
        return salarioLiq;
    }

    public double incrementoSal(double porcento){
       return salarioLiq += salarioLiq * porcento/100;
    }


    public Funcionario(String name, double salarioBruto, double tax) {
        this.name = name;
        this.salarioBruto = salarioBruto;
        this.tax = tax;
    }

    public String toString() {
        return name + ", $" + String.format("%.2f%n", salarioLiquido()) +
                "Salrio atual e de= $" + String.format("%.2f%n",incrementoSal(10));
    }
}
