package Faculdade;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua primeira nota: "); float nota1 = input.nextFloat();
        System.out.print("Informe a segunda nota: "); float nota2 = input.nextFloat();

        float media = (nota1 + nota2) / 2;
        if(media < 6){
            System.out.print("MÉDIA " + media + " - REPROVADO");
        }else{
            System.out.println("MÉDIA " + media + " - APROVADO");
        }
        input.close();
    }
}
