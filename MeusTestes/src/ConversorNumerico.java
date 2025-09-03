import java.util.*;
import java.util.Scanner;
import java.util.stream.Collector;

public class ConversorNumerico {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: "); int numero = input.nextInt();
        System.out.print("[1] Binario \n[2] Hexadecimal \n[3] Octal \nEscolha uma opção: ");

        int option = input.nextInt();
        int bit = 0;
        int tamanhoArray = 0;
        int NumeroTemporario = numero;

        while(NumeroTemporario > 0){  //estabelece o tamanho da lista a partir de divisoes por inteiro
            NumeroTemporario = NumeroTemporario / 2;
            tamanhoArray += 1;
        }
        int[] ArraydoBit = new int[tamanhoArray];

        switch(option){ //escolha das opções
            case 1:
                while(numero > 0){
                    int i = 0;
                    i += 1;
                    bit = numero % 2;
                    numero = numero / 2;
                    ArraydoBit[i] = bit;
//                    System.out.print(ArraydoBit[i]);
                    List<String> listinha = new ArrayList<>(ArraydoBit[i]);
                    System.out.println(listinha);
                }
                break;
            case 2:
                break;
            case 3:
                break;
        }
        input.close();
    }
}
