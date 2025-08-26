package Faculdade;

import java.util.Random;

public class AleatorioMultiplos {
    public static void main(String[] args){
        Random gerador = new Random();
        int QuantiGerado = 0;

        System.out.println("Multiplos de 7 gerados: ");

        for (int i = 0; i < 15; i++){
           int gerado = gerador.nextInt(30);
           if (gerado % 7 == 0){
               QuantiGerado++;
               System.out.print(gerado + " - ");
           }
        }
        System.out.println("\nQuantidade de multiplos gerados: " + QuantiGerado);
    }
}
