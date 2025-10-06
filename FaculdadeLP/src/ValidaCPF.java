import java.util.Scanner;

public class ValidaCPF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Soma = 0;
        int Soma02 = 0;
        int digitoVer01 = 0;
        System.out.print("Informe os números do seu CPF (sem o digito): "); String CPF = input.next();

        //Converte STRING em ARRAY de INT
        char[] charcpf = CPF.toCharArray();
        int[] digito = new int[9];

        for(int i = 0; i < 9; i++){
            digito[i] = Character.getNumericValue(charcpf[i]);
        }

        //CALCULO do PRIMEIRO DIGITO
        for(int i = 0; i < 9; i++){
            Soma += digito[i] * (10 - i);
        }
        int Resto01 = Soma % 11;
        if(Resto01 < 2){
            digitoVer01 = 0;
        }else{
            digitoVer01 = 11 - Resto01;
        }

        //CALCULO do SEGUNDO DIGITO
        for(int i = 0; i < 9; i++) {
            Soma02 = digito[i] * (11 - i);
            System.out.println(Soma02);

        }
        Soma02 += Resto01 * 2;
    }
}
