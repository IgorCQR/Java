package Faculdade;
import java.util
        .Scanner;
public class Exercicio06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número: "); int n1 = input.nextInt();
        System.out.print("Informe outro número: "); int n2 = input.nextInt();

        if(n1 > n2){
            System.out.println("O maior número é o " + n1);
        }else{
            System.out.println("O maior número é o " + n2);
        }
        input.close();
    }
}

