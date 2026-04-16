package org.example;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        piloto1.nome = "Mario do Armario";
        kart1.nome = "ROLIMA";
        
        piloto2.nome = "Senhor Borracha";
        kart2.nome = "TOMADO";
        piloto2.vilao = true;

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto2.soltarSuperPoder();
        kart1.pular();
        kart2.fazerDrift();
        kart2.soltarTurbo();
    }
}
