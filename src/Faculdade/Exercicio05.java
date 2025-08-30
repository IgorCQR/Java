package Faculdade;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o ano atual: "); int anoAtual = input.nextInt();
        System.out.print("Em que ano você nasceu? "); int anoNascimento = input.nextInt();

        int idade = anoAtual - anoNascimento;
        if(idade >= 16 && idade < 18){
            System.out.println("Você pode votar. VOTO FACULTATIVO");
        }else if(idade < 16){
            System.out.println("Você não pode votar");
        }else if(idade >= 18){
            System.out.println("Você pode votar. VOTO OBRIGATÓRIO");
        }
    }
}
