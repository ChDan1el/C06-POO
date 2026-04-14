package br.inatel.poo.turmas;

public class Aluno {
    public String nome;
    public String matricula;
    public double[] notas;

    public double calcularMedia(){
        double soma = 0;

        for(int i=0;i<notas.length;i++){
            soma += notas[i];
        }
        soma /= notas.length;
        return soma;
    }

    public void mostrarInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Matricula: "+this.matricula);
        for(int i=0;i<notas.length;i++){
            System.out.println("Nota: "+notas[i]);
        }//for
        System.out.println();
        System.out.println("Media: "+calcularMedia());
        System.out.println();
    }
}
