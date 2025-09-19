package EstruturaDecisao2;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        if(idade >= 18){
            System.out.print("Foi aprovado no curso teórico? (true/false): ");
            boolean aprovadoTeorico = scanner.nextBoolean();
            System.out.print("Foi aprovado no curso prático? (true/false): ");
            boolean aprovadoPratico = scanner.nextBoolean();

            if (aprovadoTeorico && aprovadoPratico) {
                System.out.println("Apto para tirar carteira de motorista.");
            } else {
                System.out.println("Não apto para tirar carteira de motorista.");
            }
        }else{
            System.out.println("Fora da idade minima para obter a carteira de motorista");
        }
        scanner.close();
    }
}
