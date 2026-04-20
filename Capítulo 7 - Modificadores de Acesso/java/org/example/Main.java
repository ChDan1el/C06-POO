package org.example;

import br.inatel.cdg.Conta;
import br.inatel.cdg.Cliente;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.setNome("Rodrigo");
        cliente.setCpf(123456789);
        conta.cliente[0] =  cliente;

        conta.deposita(5000);
        System.out.println("Saldo: R$"+conta.getSaldo());
        conta.sacar(400);
        System.out.println("Saldo: R$"+conta.getSaldo());

        conta.setLimite(10000);
        conta.setNumero(888777111);

        System.out.println();
        System.out.println("Informações da conta: ");
        System.out.println("Nome: "+conta.cliente[0].getNome());
        System.out.println("Cpf: "+conta.cliente[0].getCpf());

        System.out.println("Numero: "+conta.getNumero());
        System.out.println("Limite: R$"+conta.getLimite());
    }
}
