package br.inatel.poo.aprender;

public class Main {
    public static void main(String[] args) {
        Banda banda = new Banda("OS MENINOS BUNITOS", "Pagode");

        Membro membro = new Membro("Robinho", "Pandeiro");
        Membro membro2 = new Membro("Junina", "Vocalista");

        Musica musica = new Musica("Até Amanhã", 3.45);

        banda.addMembroNovo(membro);
        banda.addMembroNovo(membro2);
        banda.addMusicaNova(musica);

        banda.mostraInfo();
    }
}
