import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);

        System.out.println("Digite o numero de alunos: ");
       int numeroAlunos =  teclado.nextInt();

       switch (numeroAlunos){
           case 10:
               System.out.println("Aula na sala I-6");
               break;

           case 20:
               System.out.println("Aula na sala I-6");
               break;
           case 30:
               System.out.println("Aula na sala I-5");
               break;
           default:
               System.out.println("Aula será no auditório");
       }
    }
}
