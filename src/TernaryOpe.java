import java.util.Scanner;

public class TernaryOpe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Ternary operator [?] = Return 1 or 2 values if a condition is true
        // Variable = (condition) ? ifTrue : ifFalse;
        
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
                                                 
        System.out.println(evenOrOdd);
        input.close();
    }
}
