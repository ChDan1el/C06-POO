package org.example;

public class Kart {
    public String nome;
    public Piloto piloto;
    public Motor motor;

    public Kart(){
        Motor motor = new Motor();

        motor.cilindradas = "100";
        motor.velocidadeMaxima = 150;
    }

    public void pular(){
        System.out.println("O "+this.nome+" deu um pulo");
    }

    public void soltarTurbo(){
        System.out.println(this.nome+" ATIVOU O TURBO!!");
    }

    public void fazerDrift(){
        System.out.println(this.nome+" fez drift");
    }
}
