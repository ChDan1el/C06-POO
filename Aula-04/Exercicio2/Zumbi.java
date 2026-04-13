public class Zumbi {
    String nome;
    double vida;

    void mostrarVida(){
        System.out.println(vida);
    }
    void transfereVida(Zumbi zumbiAlvo , double valor){
        vida-=valor;
        zumbiAlvo.vida+=valor;
    }
}
