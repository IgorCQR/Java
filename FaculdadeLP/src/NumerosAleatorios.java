import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args){
        Random gerador = new Random();
        int maior = 0;

        for (int i = 0; i < 10; i++){
            int aleatorio = gerador.nextInt(100);
            System.out.print(aleatorio + "||");
            if(aleatorio >= maior){
               maior = aleatorio;
            }
        }
        System.out.println("\nO maior número é foi o " + maior);
    }
}
