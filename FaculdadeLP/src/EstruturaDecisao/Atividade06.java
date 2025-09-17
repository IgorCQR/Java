package EstruturaDecisao;
import java.util.Objects;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Sua idade: "); int idade = input.nextInt();
        System.out.print("Você possui histórico de acidentes? [S/N] ");
        String acidente = input.next().toUpperCase();
        System.out.print("Possui curso de direção defensiva? [S/N] ");
        String curso = input.next().toUpperCase();

        String[] lista = new String[3];
        lista[0] = "Baixa";
        lista[1] = "Média";
        lista[2] = "Alta";
        String taxa = "";
        int i = 0;

        if (idade > 30){
            taxa = lista[i];
        }else if(idade >= 21 && idade <= 30){
            i++;
            taxa = lista[i];
        }else {
            i = 2;
            taxa = lista[i];
        }
        if(Objects.equals(acidente, "S")){
            if(i < 2){
                i++;
                taxa = lista[i];
            }
        }else if(Objects.equals(curso, "S")){
            if(i > 0){
                i--;
                taxa = lista[i];
            }
        }
        System.out.println("Seguro com taxa " + taxa);
        input.close();
    }
}
