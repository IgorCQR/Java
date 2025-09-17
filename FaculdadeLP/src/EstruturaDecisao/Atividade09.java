package EstruturaDecisao;
import java.util.Objects;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sua idade: "); int idade = input.nextInt();
        System.out.print("Seu peso: "); int peso = input.nextInt();
        System.out.print("Possui certificado de educação física? [S/N] "); String certificado = input.next().toUpperCase();
        if(idade >= 18 && peso <= 120 || Objects.equals(certificado,"S")){
            System.out.print("Experiencia em esportes de aventuras (meses): "); int experiencia = input.nextInt();
            System.out.print("Possui algum problema cardíaco? [S/N] "); String cardiacao = input.next().toUpperCase();
            if(experiencia >= 24){
                System.out.println("Candidato com prioridade para viagens");
            }else if(Objects.equals(cardiacao,"S")){
                System.out.println("Candidato proibido de realizar viagens de alto risco");
            }else{
                System.out.println("Candidato apto para viagens");
            }
        }else{
            System.out.println("Candidato inápto para viagens");
        }
        input.close();
    }
}
