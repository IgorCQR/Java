import java.util.Scanner;

public class ConversorNumerico {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número: "); int numero = input.nextInt();
        System.out.print("[1] Binario \n[2] Hexadecimal \n[3] Octal \nEscolha uma opção: ");

        int option = input.nextInt();
        int bit = 0;
        int tamanhoArray = 0;
        int NumeroTemporario = numero;

//        while(NumeroTemporario > 1){
//            NumeroTemporario = NumeroTemporario / 2;
//            tamanhoArray += 1;
//        }
        int[] ArraydoBit = new int[tamanhoArray];

        switch(option){
            case 1:
                while(numero > 1){
                    bit = numero % 2;
                    numero = numero / 2;
                    for(int i = 0; numero > 1; i++){
                       ArraydoBit[i] = bit;
                       System.out.print(ArraydoBit[i]);
                    }
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
