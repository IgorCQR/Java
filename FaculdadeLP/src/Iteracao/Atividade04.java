package Iteracao;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos alunos entram na academia? "); int alunos = input.nextInt();
        int contador = 0;
        double Totalpeso = 0;

        do{
            alunos--;
            contador++;
            System.out.print("Peso do " + contador + "º aluno: "); double peso = input.nextDouble();
            Totalpeso += peso;
        }while(alunos > 0);
        double mediaPeso = Totalpeso / contador;
        System.out.println("O total de alunos é " + contador + " - A média de peso é " + String.format("%.2f",mediaPeso)
                + "Kg");
        input.close();
    }
}
