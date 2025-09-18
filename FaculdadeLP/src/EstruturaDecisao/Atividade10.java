package EstruturaDecisao;
import java.util.Objects;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe sua idade: "); int idade = input.nextInt();
        System.out.print("Paciente é gestante? [S/N] ");
        String gestante = input.next().toUpperCase();
        System.out.print("Possui condição critica? [S/N] ");
        String condicao = input.next().toUpperCase();
        System.out.print("O paciente possui doenças crônicas? [S/N] ");
        String cronico = input.next().toUpperCase();
        System.out.print("O paciente possui sintomas? [S/N] ");
        String sintoma = input.next().toUpperCase();
        System.out.print("Possui condições especiais? [S/N] ");
        String especial = input.next().toUpperCase();

        if(idade > 65 && Objects.equals(condicao,"S") || Objects.equals(gestante,"S")) {
            System.out.println("Prioridade alta");
        }else if(Objects.equals(cronico,"S") && Objects.equals(sintoma,"S")){
            System.out.println("Prioridade média");
        }else if(Objects.equals(especial,"N")){
            System.out.println("Prioridade baixa");
        }else if(Objects.equals(condicao,"S")){
            System.out.println("Prioridade máxima");
        }
        input.close();
    }
}
