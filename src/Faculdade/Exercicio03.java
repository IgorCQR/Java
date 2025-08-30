package Faculdade;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("VENDA DE MAÇÃS");
        System.out.print("Quantas maçãs você quer comprar? ");
        int QuantiMaca = input.nextInt();

        double totalMaca = 0;
        int valorMaisDuzia = 1;
        double valorMenosDuzia = 1.30;
        
        if(QuantiMaca < 12){
           totalMaca = QuantiMaca * valorMenosDuzia;
        }else{
            totalMaca = QuantiMaca * valorMaisDuzia;
        }
        System.out.println("Comprando " + QuantiMaca + " maçãs, você pagará R$" + totalMaca);
        input.close();
    }
}
