package br.inatel.poo.aprender;

public class Empresario {
    private String nome;
    private String cnpj;

    public Empresario(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCnpj(){
        return this.cnpj;
    }
}
