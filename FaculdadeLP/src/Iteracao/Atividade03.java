package Iteracao;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos ingressos você deseja comprar? "); int ingressosTotal = input.nextInt();
        System.out.print("Ingressos para estudantes: "); int Estudante = input.nextInt();
        int ingressoNormal = ingressosTotal - Estudante;
        int valorEstudante = 0;
        int valorNormal = 0;
        int valorIngressos = 0;
        int contador = 0;
        do {
            ingressosTotal--;
            if(ingressoNormal > 0){
                ingressoNormal--;
                valorNormal += 20;
            } else if(Estudante > 0){
                Estudante--;
                valorEstudante += 10;
            }
            contador++;
        }while(ingressosTotal > 0);
        valorIngressos += valorEstudante + valorNormal;

        System.out.println("Foram comprados " + contador + " ingressos - O valor arrecadado foi de R$" + valorIngressos);
        input.close();
    }
}
