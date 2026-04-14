package br.inatel.poo.turmas;

public class Turma {
    private int quantidadeAlunos;
    private Aluno[] alunos = new Aluno[3];

    public void adicionarAluno(Aluno aluno){
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    public void listarAlunos(){
        for(int i=0;i<quantidadeAlunos;i++){
            alunos[i].mostrarInfo();
        }
    }

    public Aluno buscarMelhorAluno(){
        Aluno melhorAluno = alunos[0];

        for(int i=1;i<quantidadeAlunos;i++){
            if(alunos[i].calcularMedia()>melhorAluno.calcularMedia()){
                melhorAluno = alunos[i];
            }//if
        }//final do for
        return melhorAluno;
    }

}
