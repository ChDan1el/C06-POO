package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();

        //aluno1
        aluno1.nome = "Raissa";
        aluno1.matricula = "7630";
        aluno1.notas = new double[3];
        aluno1.notas[0] = 6.2;
        aluno1.notas[1] = 8.0;
        aluno1.notas[2] = 7.8;

        //aluno2
        aluno2.nome = "Samuel";
        aluno2.matricula = "8237";
        aluno2.notas = new double[3];
        aluno2.notas[0] = 9.0;
        aluno2.notas[1] = 8.3;
        aluno2.notas[2] = 8.9;

        //aluno3
        aluno3.nome = "Sara";
        aluno3.matricula = "6769";
        aluno3.notas = new double[3];
        aluno3.notas[0] = 10.0;
        aluno3.notas[1] = 7.5;
        aluno3.notas[2] = 9.1;

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        System.out.println("LISTA DOS ALUNOS:");
        turma.listarAlunos();

        Aluno melhor = turma.buscarMelhorAluno();

        System.out.println("O MELHOR ALUNO: ");
        System.out.println("Nome: "+melhor.nome);
        System.out.println("Media: "+melhor.calcularMedia());
    }
}
