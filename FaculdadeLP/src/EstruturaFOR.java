import java.util.Random;
public class EstruturaFOR {
    public static void main(String[] args){
        Random randomico = new Random();

        int totalImpar = 0;
        int totalPar = 0;
        int par = 0;
        int impar = 0;
        int contador = 20;
        int total = 0;

        System.out.println("Repeticao com FOR");
        for(;contador > 0; contador--){
            int aleatorio = randomico.nextInt(60);
            System.out.println("Contador: " + contador + " - Aleatório: " + aleatorio);
            total += aleatorio;
            if(aleatorio % 2 == 0){
                par++;
                totalPar += aleatorio;
            }else{
                impar++;
                totalImpar += aleatorio;
            }
        }
        int mediaPar = totalPar / 20;
        int mediaImpar = totalImpar / 20;
        System.out.println("\nMédia de numeros pares: " + totalPar);
        System.out.println("\nMédia de numeros impares: " + totalImpar);
        System.out.println("\nSoma de todos os número: " + total);
        System.out.println("\nTotal de pares: " + par);
        System.out.println("\nTotal de impares: " + impar);
    }
}
