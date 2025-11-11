package ExercicioVetores;
import java.util.Random;

public class Atividade01 {
    public static void main(String[] args){
        Random random = new Random();
        float[] media = new float[10];
        int aprovado = 0;
        int recuperacao = 0;
        for(int i = 0;i < media.length;i++){
            media[i] = random.nextFloat(10);
            if(media[i] >= 6){
                aprovado++;
            }else{
                recuperacao++;
            }
        }
        System.out.println("Aprovados: " + aprovado);
        System.out.println("Recuperação: " + recuperacao);
    }
}
