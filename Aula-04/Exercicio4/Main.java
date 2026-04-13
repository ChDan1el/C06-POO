public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Seu Railson";
        zumbi1.vida = 100;

        zumbi2.nome = "Seu Jaime";
        zumbi2.vida = 40;
        System.out.println("O zumbi 1 se chama "+zumbi1.nome+"e está com "+zumbi1.mostrarVida()+" de vida");
        System.out.println("O zumbi 2 se chama "+zumbi2.nome+"e está com "+zumbi2.mostrarVida()+" de vida");

        //pega a vida do 2 e transfere para o 1, basicamente o 1 está comendo o 2
        zumbi1.transfereVida(zumbi2, 30);

        System.out.println("Vida do Zumbi1: "+zumbi1.mostrarVida());
        System.out.println("Vida do Zumbi2: "+zumbi2.mostrarVida());
    }
}
