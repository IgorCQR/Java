import java.util.Random;
public class EstrutuaDOWHILE {
    public static void main(String[] args){
        Random Randomico = new Random();

        int par = 0;
        int impar = 0;
        int contador = 21;
        int total = 0;

        do{
           contador--;
           int aleatorio = Randomico.nextInt(60);
           System.out.println("Contador: " + contador + " - aleatorio: " + aleatorio);
           total += aleatorio;
           if(aleatorio % 2 == 0){
               par++;
           }else{
               impar++;
           }
        }while(contador > 1);
        System.out.println("\nSoma de todos os valores: " + total);
        System.out.println("\nTotal de pares: " + par);
        System.out.println("\nTotal de impares: " + impar);
    }
}
