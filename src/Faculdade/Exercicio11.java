package Faculdade;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("SALÁRIO E VENDAS");
        System.out.print("Qual o seu salário base? "); float salario = input.nextFloat();
        System.out.print("Valor total das vendas realizadas: "); float vendas = input.nextFloat();
        double comissao = vendas * 3/100;;
        double NovSalario = 0;

        if(vendas < 1500){
            NovSalario = comissao + salario;
            System.out.println("Seu salário final é de R$" + String.format("%.2f", NovSalario) + " - já acrescido da comissão");
        }else {
            comissao += (vendas - 1500) * 5/100;
            NovSalario = comissao + salario;
            System.out.println("Seu salário final é de R$" + String.format("%.2f", NovSalario) + " - já acrescido da comissão");
        }
        input.close();
    }
}
