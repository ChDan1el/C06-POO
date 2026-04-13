public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();

        zumbi.nome = "Seu Railson";
        zumbi.fome = 10;
        zumbi.velocidade = 4;
        zumbi.inteligencia = 6;

        System.out.println("O zumbi se chama "+zumbi.nome);

        zumbi.Comer();
        zumbi.Correr();

    }
}
