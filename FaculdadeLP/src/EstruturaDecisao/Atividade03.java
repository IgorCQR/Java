package EstruturaDecisao;
import java.util.Objects;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua idade: "); int idade = input.nextInt();
        if(idade >= 12 && idade <= 18) {
            System.out.print("Qual sua nota em matematica do ultimo ano? ");
            int nota = input.nextInt();
            System.out.print("Você participou de alguma competição regional [S/N]? ");
            String competi = input.next().toUpperCase();
            if(nota >= 70 || Objects.equals(competi,"S")){
                System.out.println("Inscrição aceita!");
            }else{
                System.out.println("Inscrição negada!");
            }
        }else{
            System.out.println("Inscrição negada! Idade fora da faixa permitida");
        }
        input.close();
    }
}
