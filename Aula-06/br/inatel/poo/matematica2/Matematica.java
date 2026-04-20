package br.inatel.poo.matematica2;

public class Matematica {
    int soma(int a, int b){
        return a+b;
    }
    int subtracao(int a, int b){
        return a-b;
    }
    double divisao(int a, int b){
        if(b==0){
            System.out.println("ERRO, IMPOSSIVEL DIVIDIR POR 0!!");
            return -1;
        }
        return a/b;
    }
}
