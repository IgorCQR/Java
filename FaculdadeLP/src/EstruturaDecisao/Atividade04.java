package EstruturaDecisao;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Faça uma avaliação do nosso funcionário [0 - 100]: ");
        int nota = input.nextInt();

        String desempenho = "";
        if(nota < 50){
            desempenho = "insatisfatório";
        }else if(nota <= 69){
            desempenho = "regular";
        }else if(nota <= 89 ){
            desempenho = "bom";
        }else{
            desempenho = "excelente";
        }
        System.out.println("Avaliação: " + desempenho);
        input.close();
    }
}
