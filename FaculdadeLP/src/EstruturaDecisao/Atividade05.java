package EstruturaDecisao;
import java.util.Objects;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe sua idade: "); int idade = input.nextInt();
        if(idade >= 6) {
            System.out.print("Nota de proficiência: ");
            int nota = input.nextInt();
            System.out.print("Você possui alguma recomendação? [S/N] ");
            String recomenda = input.next().toUpperCase();
            if(nota > 70 || Objects.equals(recomenda, "S")){
                System.out.println("Categoria: avançado");
            }else if(nota >= 30){
                System.out.println("Categoria: intermediario");
            }else{
                System.out.println("Categoria: iniciante");
            }
        }else{
            System.out.println("Jovem demais para ingressar nos cursos");
        }
        input.close();
    }
}
