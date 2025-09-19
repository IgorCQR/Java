package EstruturaDecisao2;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Concluiu ensino superior? (true/false): ");
        boolean ensinoSuperior = scanner.nextBoolean();
        System.out.print("Digite os anos de experiência: ");
        int experiencia = scanner.nextInt();
        System.out.print("Nível de inglês (intermediario/avancado): ");
        String ingles = scanner.next();
        System.out.print("Tem pós-graduação? (true/false): ");
        boolean posGraduacao = scanner.nextBoolean();

        if (idade >= 21 && idade <= 55 && ensinoSuperior) {
            if ((experiencia >= 2 && (ingles.equals("intermediario") || ingles.equals("avancado"))) ||
                    (experiencia == 0 && ingles.equals("avancado") && posGraduacao)) {
                System.out.println("Pode ser contratado.");
            } else {
                System.out.println("Não pode ser contratado.");
            }
        } else {
            System.out.println("Não pode ser contratado (não atende aos critérios básicos).");
        }
        scanner.close();
    }
}
