import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        double result = 1 / (number - 1);
        System.out.println(result);
        input.close();
    }
}
