import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor: "); int n1 = input.nextInt();
        System.out.print("Digite outro valor: "); int n2 = input.nextInt();

        int maior = 0;
        int menor = 0;
        if(n1 > n2){
            maior = n1;
            menor = n2;
        }else{
            maior = n2;
            menor = n1;
        }

        System.out.println("Valores em ordem CRESCENTE: " + maior + " | " + menor);
        System.out.println("Valores em ordem DECRESCENTE: " + menor + " | " + maior);
        input.close();
    }
}
