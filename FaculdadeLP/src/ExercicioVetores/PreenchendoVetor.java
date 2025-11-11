package ExercicioVetores;
import java.util.Random;

public class PreenchendoVetor {
    public static void main(String[] args){
        Random random = new Random();
        int[] [] matriz = new int[5][5];
        int [] vetor = new int[4];
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int acumulador = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matriz[i][j] = random.nextInt(1,7);
            System.out.print(matriz[i] [j] + " - ");
            acumulador += matriz[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("Total matriz: " + acumulador);

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j <matriz.length; j++){
                if(matriz[i][j] == 1){
                    n1++;
                }else if(matriz[i][j] == 2){
                    n2++;
                }else if(matriz[i][j] == 3){
                    n3++;
                }else if(matriz[i][j] == 4){
                    n4++;
                }else if(matriz[i][j] == 5){
                    n5++;
                } else if(matriz[i][j] == 6){
                    n6++;
                }
            }
        }

        for(int i = 0; i < 4; i++){
            switch(vetor[i]){
                case 0:
                    vetor[i] = n1;
                case 1:
                    vetor[i] = n2;
                case 2:
                    vetor[i] = n3;
                case 3:
                    vetor[i] = n4;
                case 4:
                    vetor[i] = n5;
                case 5:
                    vetor[i] = n6;
            }
            System.out.print(vetor[i] + " - ");
        }
    }
}
