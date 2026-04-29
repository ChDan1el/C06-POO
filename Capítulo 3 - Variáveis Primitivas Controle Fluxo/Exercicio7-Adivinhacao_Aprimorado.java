import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        int x = rand.nextInt(10)+1;
        System.out.print("Tente acertar um número entre 1 e 10: ");
        int numero = teclado.nextInt();

        while (numero != x) {
            if(numero>x){
                System.out.print("Tente um número menor: ");
                numero = teclado.nextInt();
            }
            else{
                System.out.print("Tente un número maior: ");
                numero = teclado.nextInt();
            }
        }
        System.out.println("ACERTOU!!");
        System.out.println("O número era " + x);
    }
}
