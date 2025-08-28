package Faculdade;
import java.util.Random;
import java.util.Scanner;

public class Repita01 {
    public static void main(String[] args){
        Random aleatorio = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Numeros aleatórios");
        System.out.print("Quantos números você deseja gerar? "); int maximo = input.nextInt();

        int menor = 50;
        int[] vetor = new int[maximo];
        int posicaoMenor = 0;
        int posicaoMaior = 0;
        int maior = 0;

        for(int i = 1; i < maximo; i++){
            int numero = aleatorio.nextInt(1,30);
            vetor[i] = numero;
            System.out.println("Valor gerado: " + vetor[i]);
            if(numero < menor){
                menor = vetor[i];
                posicaoMenor = i - 1;
            }else if(numero > maior){
                maior = vetor[i];
                posicaoMaior = i - 1;
            }
        }
        System.out.println("O MENOR número gerado foi o " + menor + ". Posição " + posicaoMenor);
        System.out.println("O MAIOR valor gerado foi o " + maior + ". Posição " + posicaoMaior);
    }
}
