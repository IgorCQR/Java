import java.util.Random;

public class Vetores {
    public static void main(String[] args){
        Random aleatorio = new Random();

        int[] vetor1 = new int[5];
        int[] vetorInverso = new int[5];
        int[] vetorSoma = new int[5];
        int contador = 4;

        for(int i = 0; i < vetor1.length; i++){
            vetor1[i] = aleatorio.nextInt(1,100);
            vetorInverso[contador] = vetor1[i];
            System.out.print(vetor1[i] + " || ");
            contador -= 1;
        }
        System.out.println("Vetor inverso: ");

        for(int tudo : vetorInverso){
            System.out.print(tudo +" || ");
        }
        System.out.println(" ");

        System.out.print("Rsultado da soma entre os vetores");
        for(int i = 0; i < 5; i++){
            vetorSoma[i] = vetor1[i] + vetorInverso[i];
            System.out.print(" || " + vetorSoma[i]);
        }
    }
}
