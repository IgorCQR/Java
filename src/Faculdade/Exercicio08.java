package Faculdade;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("JOGO DE XADREZ");
        System.out.print("Qual o horário de inicio da partida? "); int InicioJogo = input.nextInt();
        System.out.print("Que horas a partida terminou? "); int FimJogo = input.nextInt();

        int TempoJogo;
        if(InicioJogo < FimJogo){
            TempoJogo = FimJogo - InicioJogo;
        }else{
            TempoJogo = (24 - InicioJogo) + FimJogo;
        }
        System.out.println("A duração do jogo foi de " + TempoJogo + " horas.");

        input.close();
    }
}
