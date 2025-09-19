package EstruturaDecisao2;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite a renda familiar: ");
        double rendaFamiliar = scanner.nextDouble();
        System.out.print("Digite a nota do exame: ");
        double notaExame = scanner.nextDouble();

        if (idade >= 18 && idade <= 35) {
            if (notaExame >= 9) {
                System.out.println("Tem direito à bolsa de estudo.");
            } else if (rendaFamiliar <= 3000 && notaExame >= 7) {
                System.out.println("Tem direito à bolsa de estudo.");
            } else {
                System.out.println("Não tem direito à bolsa de estudo.");
            }
        } else {
            System.out.println("Não tem direito à bolsa de estudo (idade fora do intervalo).");
        }
        scanner.close();
    }
}
