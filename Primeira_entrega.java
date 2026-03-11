package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de ingressos inteiros: ");
        int ingresso_Int = teclado.nextInt();

        System.out.print("Digite o número de ingressos meia: ");
        int ingresso_Meia = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Digite o valor do ingresso: ");
        String valor = teclado.nextLine();

        valor = valor.replace(',', '.');

        float ingresso_valor = Float.parseFloat(valor);

        float arrecadado_Int = ingresso_Int * ingresso_valor;
        float arrecadado_Meia = ingresso_Meia * (ingresso_valor / 2);

        System.out.println("Valor arrecadado com as inteiras: R$" + arrecadado_Int);
        System.out.println("Valor arrecadado com as meias: R$" + arrecadado_Meia);
        System.out.println("Valor Total arrecadado: R$" + (arrecadado_Meia + arrecadado_Int));
        System.out.println("Valor médio do ingresso: R$" + (arrecadado_Int + arrecadado_Meia) / (float) (ingresso_Meia + ingresso_Int));
    }
}
