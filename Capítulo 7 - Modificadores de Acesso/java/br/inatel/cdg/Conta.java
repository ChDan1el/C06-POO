package br.inatel.cdg;

public class Conta {
    private int numero;
    private double saldo;
    private int limite;

    public Cliente[] cliente =  new Cliente[10];

    public void deposita(float valor) {
        if(valor>=0){
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso");
        }
        else{
            System.out.println("Deposito invalido!");
        }
    }//DEPOSITAR

    public void sacar(float valor) {
        if(valor<=this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
        else{
            System.out.println("Saldo Insuficiente!");
        }
    }//SACAR

    //INSERIR NUMERO
    public void setNumero(int numero){
        this.numero = numero;
    }
    //RETORNAR NUMERO
    public int getNumero(){
        return this.numero;
    }

    public void setLimite(int limite){
        this.limite = limite;
    }

    public int getLimite(){
        return this.limite;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

}
