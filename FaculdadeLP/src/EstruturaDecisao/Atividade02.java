package EstruturaDecisao;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua primeira nota: "); float nota1 = input.nextFloat();
        System.out.print("Informe sua segunda nota: "); float nota2 = input.nextFloat();

        String resultado = "";
        float media = (nota1 + nota2) / 2;
        if(media >= 7){
            resultado = "aprovado";
        }else if(media >= 5 || media < 7){
            resultado = "recuperação";
        }else{
            resultado = "reprovado";
        }
        System.out.println("Sua média é " + media + " - " + resultado);
        input.close();
    }
}
