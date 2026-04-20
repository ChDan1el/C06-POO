package org.example;

public class Banda {
    public String nome;
    public String genero;

    public Membro[] membro = new Membro[10];
    public Musica[] musica =  new Musica[50];
    public Empresario empresario;

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);

        if(this.empresario != null){
            System.out.println("Empresario: " + this.empresario.nome);
        }

        System.out.println();
        System.out.println("Musicas: ");
        for(int i = 0; i < this.musica.length; i++){
            if(this.musica[i] != null){
                System.out.println(this.musica[i].nome);
            }
        }//musicas

        System.out.println();
        System.out.println("Membros: ");
        for(int i=0; i<this.membro.length; i++){
            if(this.membro[i] != null){
                System.out.println(this.membro[i].nome);
            }
        }//membro
    }//mostraInfo

    public void addMusicaNova(Musica musica){
        for(int i=0; i<this.musica.length; i++){
            if(this.musica[i]==null){
                this.musica[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for(int i=0; i<this.membro.length; i++){
            if(this.membro[i]==null){
                this.membro[i]=membro;
                break;
            }
        }
    }

    public void addEmpresario(Empresario empresario){
        this.empresario = empresario;
    }
}
