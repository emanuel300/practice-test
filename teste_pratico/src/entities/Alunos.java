package entities;

public class Alunos {
    public String nome;
    public double b1;
    public double b2;
    public double b3;




    public double grade(){
        return b1 + b2 + b3/3 ;
    }

    public double passFiel(){
        if(grade() < 60.0){
            return 60 - grade();
        }
        else {
            return 0.0;
        }
    }

    public String situcao(){
        if(grade() > 60){
            return "Aluno aprovado";
        }
        else{
            return "Aluno reprovado";
        }
    }

    public Alunos(String nome, double b1, double b2, double b3) {
        this.nome = nome;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
    }

    @Override
    public String toString() {
        return "Aluno=" + nome + " Grade de notas " + b1 + ", " + b2 + ", " + b3 + " " +
                "Media final=" + String.format("%.2f%n", grade()) +
                "Situação do aluno=" + situcao() +
                " Pontos que faltaram=" + String.format("%.1f", passFiel());
    }
}
