import java.util.Scanner;

public class ConversorWeight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double weight;
        double neweight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kg");
        System.out.println("2: Convert kg to lbs");

        System.out.print("Choose an option: ");
        choice = input.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in lbs: ");
            weight = input.nextDouble();
            neweight = weight * 0.453592;
            System.out.printf("Your weight in kgs is: %.2f", neweight);
        }else if(choice == 2){
            System.out.print("Enter your weight in kg: ");
            weight = input.nextDouble();
            neweight = weight * 2.20462;
            System.out.printf("Your weight in lbs is: %.2f", neweight);
        }else{
        System.out.println("Invalid option!");
        }
        input.close();
    }
}
