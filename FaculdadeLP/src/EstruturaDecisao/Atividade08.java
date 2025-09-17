package EstruturaDecisao;
import java.util.Objects;
import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sua idade: "); int idade = input.nextInt();
        System.out.print("Possui alguma pendência acadêmica? [S/N] "); String pendencia = input.next().toUpperCase();

        if(idade <= 35 && Objects.equals(pendencia, "N")){
            System.out.print("Tempo de experiencia (meses): "); int expe = input.nextInt();
            System.out.print("Possui publicações em revistas internacionais? [S/N] ");
            String revista = input.next().toUpperCase();
            if(Objects.equals(revista,"S")){
                System.out.println("Candidato elegivel para adquirir a Bolsa de Pesquisa Cientifica");
            }else{
                if(expe >= 24){
                    System.out.println("Candidato elegivel para adquirir a Bolsa de Pesquisa Cientifica");
                }else{
                    System.out.println("Candidato inelegivel para adquirir a Bolsa de Pesquisa Cientifica");
                }
            }
        }else{
            System.out.print("Bolsa de Pesquisa NEGADA!");
        }
        input.close();
    }
}
