package EstruturaDecisao;
import java.util.Scanner;
public class Atividade07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a idade miníma para os expectadores do filme: ");
        int idade = input.nextInt();

        if(idade < 10){
            System.out.println("Classificação Livre");
        }else if(idade <= 13){
            System.out.println("Classificação 10+");
        }else if(idade <= 17) {
            System.out.println("Classificação 14+");
        }else{
            System.out.println("Classificação 18+");
        }
        input.close();
    }
}
