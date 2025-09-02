package Faculdade;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("PESO IDEAL");
        System.out.print("Digite seu nome: "); String name = input.nextLine();
        System.out.print("Seu sexo (M/F): "); String gender = input.nextLine().toUpperCase();
        System.out.print("Digite sua altura: "); float height = input.nextFloat();

        double pesoIdeal = 0;
        if(gender == "M"){
            pesoIdeal = (72.7 * height) - 58;
        }else{
            pesoIdeal = (62.1 * height) - 44.7;
        }
        System.out.println(name + ", o peso ideal para uma pessoa do genero " + gender + " com " + height + "m de altura" +
                " è " + String.format("%.2f", pesoIdeal) + "kg");
        input.close();
    }
}
