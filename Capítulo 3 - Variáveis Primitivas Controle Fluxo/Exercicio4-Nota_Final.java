package org.example;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        System.out.print("Digite a NPA: ");
        int NPA = teclado.nextInt();

        if(NPA>=60){
            System.out.println("APROVADO!");
        }
        else if(NPA>30 && NPA<60){
            System.out.println("FARA NP3");
            System.out.print("DIGITE A NP3: ");
            int NP3 =  teclado.nextInt();

            float NFA = (NPA+NP3)/2.0f;
            if(NFA>=50){
                System.out.println("APROVADO!");
            }
            else{
                System.out.println("REPROVADO!");
            }
        }
        else{
            System.out.println("REPROVADO!");
        }
    }
}
