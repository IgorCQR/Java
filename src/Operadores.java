import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float numero1 = input.nextInt();
        float numero2 = input.nextInt();

        float soma = numero1 + numero2;
        float diferenca = numero1 - numero2;
        float produto = numero1 * numero2;
        float divisao = numero1 / numero2;
        float resto = numero1 % numero2;
        float inteiro = numero1 + numero2;

        System.out.println("A soma entre " + numero1 + " e " + numero2 + ": " + soma);
        System.out.println("A diferença entre " + numero1 + " e " + numero2 + ": " + diferenca);
        System.out.println("O produto entre " + numero1 + " e " + numero2 + ": " + produto);
        System.out.println("A divisão entre " + numero1 + " e " + numero2 + ": " + divisao);
        System.out.println("O resto da divisão entre " + numero1 + " e " + numero2 + ": " + resto);
        input.close();
    }
}
