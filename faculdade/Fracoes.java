import java.util.Scanner;

public class Fracoes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um númerador: "); float numerador = input.nextInt();
        System.out.print("Digite um denominador: "); float denominador = input.nextInt();
        System.out.print("Digite outro númerador: "); float numerador2 = input.nextInt();
        System.out.print("Digite outro denominador: "); float denominador2 = input.nextInt();
        float resultado = 0;

        System.out.print(" 1-Soma \n 2-Subtração \n " +
                "3-Produto \n 4-Divisão \nEscolha uma opção: ");
        int opcao = input.nextInt();
        switch(opcao){
            case 1:
                resultado = (numerador / denominador) + (numerador2 / denominador2);
                break;
            case 2:
                resultado = (numerador /  denominador) - (numerador2 / denominador2);
                break;
            case 3:
                resultado = (numerador /  denominador) * (numerador2 / denominador2);
                break;
            case 4:
                resultado = (numerador / denominador) / (numerador2 / denominador2);
                break;
        }
        System.out.print("Resultado: " + resultado);
        input.close();
    }
}
