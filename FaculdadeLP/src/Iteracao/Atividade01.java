package Iteracao;
import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor do depósito: "); double deposito = input.nextDouble();
        System.out.print("Taxa de juros da poupança: "); double taxa = input.nextDouble();
        System.out.print("Por quantos meses você planeja deixar o dinheiro? "); int meses = input.nextInt();
        double Juros = 0;
        double totalJuros = 0;
        do {
          Juros = deposito * (taxa/100);
          deposito += Juros;
          totalJuros += Juros;
          System.out.println("Mes: " + meses + " - Juros R$" + String.format("%.2f",Juros));
          meses--;
        }while (meses > 0);
        System.out.println("Seu depósito rendeu R$" + String.format("%.2f",totalJuros) + " de juros");
        System.out.println("O valor total do rendimento é de R$" + String.format("%.2f",deposito));
        input.close();
    }
}
