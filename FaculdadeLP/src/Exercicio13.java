import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("PRODUTO EM ESTOQUE");

        System.out.print("Qual a quantidade atual no estoque? "); int EstoqueAtual = input.nextInt();
        System.out.print("Qual a quantidade maxima do estoque? "); int EstoqueMax = input.nextInt();
        System.out.print("Qual a quantidade minima do estoque? "); int EstoqueMin = input.nextInt();

        int EstoqueMedia = (EstoqueMax + EstoqueMin) / 2;
        if(EstoqueMedia <= EstoqueAtual){
            System.out.println("Não efetuar a compra");
        }else{
            System.out.println("Efetuar a compra");
        }
        input.close();
    }
}
