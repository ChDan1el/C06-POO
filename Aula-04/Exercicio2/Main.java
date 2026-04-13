public class Main {
    public static void main(String[] args) {
        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Seu Railson";
        zumbi1.vida = 100;

        zumbi2.nome = "Seu Jaime";
        zumbi2.vida = 40;
        System.out.println("O zumbi 1 se chama "+zumbi1.nome+"e está com "+zumbi1.vida+" de vida");
        System.out.println("O zumbi 2 se chama "+zumbi2.nome+"e está com "+zumbi2.vida+" de vida");

        zumbi1.transfereVida(zumbi2, 20);

        System.out.println();
        System.out.println("Novas vidas:");
        System.out.println("Vida do zumbi 1: "+zumbi1.vida);
        System.out.println("Vida do zumbi 2: "+zumbi2.vida);
    }
}
