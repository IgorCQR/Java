package EstruturaDecisao2;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o IMC: ");
        double imc = scanner.nextDouble();
        System.out.print("Tem doenças crônicas? (true/false): ");
        boolean temDoencasCronicas = scanner.nextBoolean();

        boolean imcSaudavel = imc >= 18.5 && imc <= 29.9;
        boolean idadeEspecial = idade <= 40;
        boolean idadeNormal = idade >= 18 && idade <= 65;

        if (idadeEspecial && imcSaudavel) {
            System.out.println("Pode contratar o plano especial.");
        } else if (idadeNormal && imcSaudavel && !temDoencasCronicas) {
            System.out.println("Pode contratar o plano especial.");
        } else {
            System.out.println("Plano negado.");
        }
        scanner.close();
    }
}
