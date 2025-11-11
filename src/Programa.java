import java.util.Random;
public class Programa {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int[] vetor = new int[30];
        int maior30 = 0;
        int menor31 = 0;
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = aleatorio.nextInt(1,61);
            if(vetor[i] > 30){
                maior30 += vetor[i];
            }else if(vetor[i] < 31){
                menor31 += vetor[i];
            }
        }
        System.out.println("Soma dos números maiores que 30: " + maior30);
        System.out.println("Soma dos números menores que 31: " + menor31);
        System.out.println("Vetor com os valores substituidos:");
        substituir(vetor);
        }
        public static int[] substituir(int... vetor) {
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] > 30){
                    vetor[i] = 0;
                }else{
                    vetor[i] = 1;
                }
                System.out.print(vetor[i] + " - ");
            }
            return vetor;
        }

}
