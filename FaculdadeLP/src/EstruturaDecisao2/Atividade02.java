package EstruturaDecisao2;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("O aluno faltou a alguma prova? (true/false): ");
        boolean faltou = scanner.nextBoolean();
        double media = 0;
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        if(!faltou){
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            media = (nota1 + nota2) / 2;
        }
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else if (media < 5 || faltou) {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}
