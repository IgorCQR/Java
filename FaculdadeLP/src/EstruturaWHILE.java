import java.util.Random;
public class EstruturaWHILE {
    public static void main(String[] args){
        Random Randomico = new Random();

        int par = 0;
        int impar = 0;
        int contador = 21;
        int total = 0;

        while(contador > 1){
            contador--;
            int aleatorio = Randomico.nextInt(60);
            System.out.println("Contador: " + contador + " - Aleatorio: " + aleatorio);
            total += aleatorio;
            if(aleatorio % 2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println("\nSoma de todos os números: " + total);
        System.out.println("\nTotal de pares: " + par);
        System.out.println("\nTotal de impares: " + impar);
    }
}
