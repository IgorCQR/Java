public class MaiorMenor {
    public static void main(String[] args){
        int numero01 = 720;
        int numero02 = 200;
        int numero03 = 100;
        int Maior = 0;
        int Menor = 0;
        if(numero01 > numero02 && numero02 > numero03){
            Maior = numero01;
            Menor = numero03;
        }else if(numero02 > numero01 && numero01 > numero03){
            Maior = numero02;
            Menor = numero03;
        }else if(numero03 > numero01 && numero01 > numero02){
            Maior = numero03;
            Menor = numero02;
        }else if(numero02 > numero03 && numero03 > numero01){
            Maior = numero02;
            Menor = numero01;
        }else if(numero01 > numero03 && numero03 > numero02){
            Maior = numero01;
            Menor = numero02;
        }else if(numero03 > numero02 && numero02 > numero01){
            Maior = numero03;
            Menor = numero01;
        }
        System.out.println(Maior);
        System.out.println(Menor);
    }
}
