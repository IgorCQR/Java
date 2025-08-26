package Faculdade;

import java.util.Random;

public class AleatorioOutro {
    public static void main(String[] args){
        Random gerador = new Random();

        int aleatorio = gerador.nextInt(20);

        if (aleatorio > 10){
            System.out.println("O número gerado é maior que 10");
        }else if (aleatorio == 10){
            System.out.println("O número gerado é igual a 10");
        }else if(aleatorio <= 9){
            System.out.println("O número gerado é igual ou menor que 9");
        }
    }
}
