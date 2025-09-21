package Iteracao;
import java.util.Scanner;
import java.util.Random;

public class Atividade02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.print("Informe o valor do depósito: "); double deposito = input.nextDouble();
        System.out.print("Taxa de juros da poupança: "); double taxa = input.nextDouble();
        System.out.print("Por quantos meses você planeja deixar o dinheiro? "); int meses = input.nextInt();
        double Juros = 0;
        double totalJuros = 0;
        double extra = 0;
        double extraTotal = 0;
        do {
            Juros = deposito * (taxa/100);
            deposito += Juros;
            totalJuros += Juros;
            System.out.println("Mes: " + meses + " - Juros R$" + String.format("%.2f",Juros) + " - Extra R$"
                    + String.format("%.2f",extra));
            meses--;
            double deposi2 = aleatorio.nextDouble(100, 400);
            deposito += deposi2;
            extra = deposi2;
            extraTotal += deposi2;
        }while (meses > 0);
        System.out.println("Seu depósito rendeu R$" + String.format("%.2f",totalJuros) + " de juros");
        System.out.println("O valor total do rendimento é de R$" + String.format("%.2f",deposito));
        System.out.println("Total de depositos extras R$" + String.format("%.2f",extraTotal));
        input.close();
    }
}
