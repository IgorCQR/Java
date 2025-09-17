package EstruturaDecisao;
import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua idade: "); int idade = input.nextInt();

        String etaria = "";
        if(idade < 12){
            etaria = "criança";
        }else if(idade >= 12 && idade <= 17){
            etaria = "adolescente";
        }else if(idade >= 18 && idade <= 59){
            etaria = "adulto";
        }else if(idade >= 60){
            etaria = "idoso";
        }
        System.out.println("Você é " + etaria);
        input.close();
    }
}
