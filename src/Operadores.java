import java.util.Scanner;

public class Operadores {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: "); float numero1 = input.nextFloat();
        System.out.print("Digite outro numero: "); float numero2 = input.nextFloat();

        float soma = numero1 + numero2;
        float diferenca = numero1 - numero2;
        float produto = numero1 * numero2;
        float divisao = numero1 / numero2;
        float resto = numero1 % numero2;

        System.out.println("\nOperadores aritméticos:");
        System.out.println("\nA soma entre " + numero1 + " e " + numero2 + ": " + soma);
        System.out.println("A diferença entre " + numero1 + " e " + numero2 + ": " + diferenca);
        System.out.println("O produto entre " + numero1 + " e " + numero2 + ": " + produto);
        System.out.println("A divisão entre " + numero1 + " e " + numero2 + ": " + divisao);
        System.out.println("O resto da divisão entre " + numero1 + " e " + numero2 + ": " + resto);


        boolean resultado;
        System.out.println("\nOperadores lógicos: ");
        System.out.println("\nTestando o operador lógico E (&&):");
        resultado = (numero1 > numero2) && (numero1 < numero2);
        System.out.println("(" + numero1 + " > " + numero2 + ") && (" + numero1 + " < " + numero2 + ") = " + resultado);

        resultado = (numero1 < numero2) && (numero1 > numero2);
        System.out.println("(" + numero1 + " < " + numero2 + ") && (" + numero1 + " > " + numero2 + ") = " + resultado);

        resultado = (numero1 < numero2) && (numero1 < numero2);
        System.out.println("(" + numero1 + " < " + numero2 + ") && (" + numero1 + " < " + numero2 + ") = " + resultado);

        System.out.println("\nTestando o operador lógico OU (||):");
        resultado = (numero1 > numero2) || (numero1 < numero2);
        System.out.println("(" + numero1 + " > " + numero2 + ") || (" + numero1 + " < " + numero2 + ") = " + resultado);

        resultado = (numero1 > numero2) || (numero1 > numero2);
        System.out.println("(" + numero1 + " > " + numero2 + ") || (" + numero1 + " > " + numero2 + ") = " + resultado);

        resultado = (numero1 < numero2) || (numero1 < numero2);
        System.out.println("(" + numero1 + " < " + numero2 + ") || (" + numero1 + " < " + numero2 + ") = " + resultado);

        System.out.println("\nTestando o operador lógico NÃO (!) para A (Primeira proposição):");
        resultado = !(numero1 > numero2);
        System.out.println("! (" + numero1 + " > " + numero2 + ") = " + resultado);

        resultado = !(numero1 < numero2);
        System.out.println("! (" + numero1 + " < " + numero2 + ") = " + resultado);

        System.out.println("\nTestando o operador lógico NÃO (!) para B (Segunda proposição):");
        resultado = !(numero1 > numero2);
        System.out.println("! (" + numero1 + " > " + numero2 + ") = " + resultado);

        resultado = !(numero1 < numero2);
        System.out.println("! (" + numero1 + " < " + numero2 + ") = " + resultado);

        input.close();
    }
}
