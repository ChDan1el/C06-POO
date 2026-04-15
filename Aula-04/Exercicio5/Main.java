package org.example;

public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Arma arma = new Arma();

        //personagem
        personagem.nome = "Capixaba";
        personagem.pontos = 100;

        //arma
        arma.nome = "AK-47";
        arma.poder = 30;
        arma.resistencia = 50;
        arma.descricao = "A arma mais versatil ja criada!!";

        personagem.arma = arma;

        personagem.usarArma();
        personagem.tomarDano();
        personagem.tomarDano();
        personagem.tomarDano();

        arma.mostraInfoArma();
        System.out.println("----------------");

        System.out.println("Personagem: " + personagem.nome);
        System.out.println("Pontos: " + personagem.pontos);
        System.out.println("Resistencia: " + arma.resistencia);

    }
}
