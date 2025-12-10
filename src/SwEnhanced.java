import java.util.Scanner;

public class SwEnhanced {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = input.next().toUpperCase();

        //Enhanced switch = A replacement to many else if statements
        switch(day){
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> System.out.println("It is a weekday");
            case "SATURDAY", "SUNDAY" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day!");
        }
    }
}
