import java.util.Random;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String [] Nomes = new String [5];
        float [] [] matriz = new float[5][4];
        float totalnota = 0;
        float media = 0;
        float MediaAprovado = 0;
        float MediaGeral = 0;

        for(int n = 0; n < Nomes.length; n++){
            System.out.print("Informe o nome do " + n + "º aluno: "); Nomes [n] = input.next();
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < 4; j++){
                matriz [i] [j] = random.nextInt(0,11);
                totalnota += matriz [i] [j];
                if(j == 3){
                    media = totalnota / 3;
                    matriz [i] [j] = media;
                    MediaGeral += totalnota;
                    totalnota = 0;
                    if(media >= 6){
                        MediaAprovado += media;
                    }
                }
                System.out.printf(" || %.2f", matriz[i] [j]);
            }
            System.out.println("\n");
        }
        MediaGeral = MediaGeral / 15;
        MediaAprovado = MediaAprovado / 5;
        System.out.printf("Média de todas as notas: %.2f \n", MediaGeral);
        System.out.printf("Média de aprovados: %.2f", MediaAprovado );

        input.close();
    }
}
