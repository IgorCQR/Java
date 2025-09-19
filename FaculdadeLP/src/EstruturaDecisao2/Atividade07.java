package EstruturaDecisao2;
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite a renda mensal: ");
        double rendaMensal = scanner.nextDouble();
        System.out.print("O nome está sujo? (true/false): ");
        boolean nomeSujo = scanner.nextBoolean();
        System.out.print("Digite o valor solicitado: ");
        double valorSolicitado = scanner.nextDouble();
        System.out.print("É servidor público? (true/false): ");
        boolean servidorPublico = scanner.nextBoolean();

        boolean aprovado = false;

        if (idade >= 21 && idade <= 65 && rendaMensal >= 2500 && !nomeSujo) {
            if (valorSolicitado <= (rendaMensal * 10)) {
                aprovado = true;
            } else if (servidorPublico && rendaMensal >= 2000) {
                aprovado = true;
            }
        }
        if (aprovado) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo negado.");
        }
        scanner.close();
    }
}

