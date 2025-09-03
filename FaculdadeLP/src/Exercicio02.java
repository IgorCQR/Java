import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("POSITIVO OU NEGATIVO");
        System.out.print("\nInforme um número: "); int numero = input.nextInt();

        if(numero >= 0){
            System.out.println("O número informado é positivo");
        }else{
            System.out.println("O número informado é negativo");
        }
        input.close();
    }
}

