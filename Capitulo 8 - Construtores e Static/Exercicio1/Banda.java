package br.inatel.poo.aprender;

public class Banda {
    private String nome;
    private String genero;

    public Membro[] membro = new Membro[10];
    public Musica[] musica =  new Musica[50];
    public Empresario empresario;

    public Banda(String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }
    public void getGenero(String nome) {
        this.genero = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);

        if(this.empresario != null){
            System.out.println("Empresario: " + this.empresario.getNome());
        }

        System.out.println();
        System.out.println("Musicas: ");
        for(int i = 0; i < this.musica.length; i++){
            if(this.musica[i] != null){
                System.out.println(this.musica[i].getNome());
            }
        }//musicas

        System.out.println();
        System.out.println("Membros: ");
        for(int i=0; i<this.membro.length; i++){
            if(this.membro[i] != null){
                System.out.println(this.membro[i].getNome());
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
