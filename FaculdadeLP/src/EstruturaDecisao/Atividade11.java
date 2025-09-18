package EstruturaDecisao;
import java.util.Objects;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua idade: "); int idade = input.nextInt();
        if(idade >= 18 && idade <= 40){
            System.out.print("Nota do teste: "); int nota = input.nextInt();
            System.out.print("Experiencia (meses): "); int expe = input.nextInt();
            System.out.print("Possui certificação? [S/N] ");
            String certifica = input.next().toUpperCase();
            if(nota >= 75 && expe >= 24 || Objects.equals(certifica,"S")){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
        }else{
            System.out.println("Reprovado");
        }
    }
}
