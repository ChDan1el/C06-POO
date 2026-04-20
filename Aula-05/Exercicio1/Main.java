package org.example;

public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda();
        banda.nome = "SABATICOS";
        banda.genero = "UDELE";

        Musica musica1 = new Musica();
        musica1.nome = "ESCARNIO";
        Musica musica2 = new Musica();
        musica2.nome = "SINGELA";

        Membro membro1 = new Membro();
        membro1.nome = "Robson";
        Membro membro2 = new Membro();
        membro2.nome = "Sabrina";

        Empresario empresario = new Empresario();
        empresario.nome = "Alan Jesus";
        empresario.cnpj = "SONEGADOR";

        banda.addMusicaNova( musica1);
        banda.addMusicaNova( musica2);
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);
        banda.addEmpresario(empresario);

        banda.mostraInfo();
    }
}

