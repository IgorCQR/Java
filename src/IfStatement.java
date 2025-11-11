import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean IsStudent = false;
        boolean IsSenior = false;
        double price = 150;
        double discount;

//        System.out.print("Are you a student? (true or false) "); IsStudent = input.hasNextBoolean();
//        System.out.print("Are you a senior? (true or false) "); IsSenior = input.hasNextBoolean();

        if (IsStudent){
            if(IsSenior){
                System.out.println("You get a student discount and senior discount, totaling 30%");
                discount = 0.30 * price;
            }else{
                System.out.println("You get a student discount of 10%");
                discount = 0.10 * price;
            }
            price -= discount;
        }                             
        else if(IsSenior){
            System.out.println("You get a senior discount of 20%");
            discount = 0.20 * price;
            price -= discount;
        }else {
            System.out.println("You not get a discount");
        }
        System.out.printf("The price of ticket is: %.2f", price);
    }
}

