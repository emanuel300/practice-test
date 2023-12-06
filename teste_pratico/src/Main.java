import entities.Alunos;
import entities.Funcionario;
import entities.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(42.2, 22.9);
        System.out.println(triangulo);

        Funcionario funcionario = new Funcionario("Clevo", 3500.34, 250);
        System.out.println(funcionario);

        Alunos aluno = new Alunos("Luffy",20,50,36);
        Alunos alunos2 = new Alunos("chan", 10,45,10);
        System.out.println(aluno);
        System.out.println();
        System.out.println(alunos2);







    }
}