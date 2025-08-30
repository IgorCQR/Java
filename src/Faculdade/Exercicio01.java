package Faculdade;

public class Exercicio01 {
    public static void main(String[] args){
        System.out.println("MAIOR OU MENOR QUE 10");
        
        int numero = 5;
        String resultado = "";
        if(numero > 10){
            resultado = "MAIOR QUE 10";
        }else{
            resultado = "MENOR QUE 10";
        }
        System.out.println("\nO número é " + resultado);
    }
}
