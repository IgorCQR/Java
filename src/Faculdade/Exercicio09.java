package Faculdade;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a quantidade de horas trabalhadas no mes: ");
        float horasTrabalho = input.nextFloat();
        System.out.print("Seu salário por hora: "); float salarioHora = input.nextFloat();

        if(horasTrabalho > 40){
            float horaExtra = horasTrabalho - 40;
            float bonus = horaExtra * (salarioHora + (salarioHora / 2));
            float NovSalario = (salarioHora * 40) + horaExtra;
            System.out.println("Seu salário final é de R$" + NovSalario + " - Já acrescido de R$" + bonus + " da hora extra.");
        }else{
            float salarioBase = salarioHora * 40;
            System.out.println("Seu salário final é de R$" + salarioBase + " - Sem acrescimo de hora extra.");
        }
    }
}
