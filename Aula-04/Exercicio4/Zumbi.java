public class Zumbi {
    String nome;
    double vida;

    public double mostrarVida(){
        return this.vida;
    }
    public boolean transfereVida(Zumbi zumbiAlvo , double valor){
        if(zumbiAlvo.vida >= valor){
            this.vida+=valor;
            zumbiAlvo.vida -= valor;
            return true;
        }
        else{
            System.out.println("Sem vida!");
            return false;
        }
    }
}
