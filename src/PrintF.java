import java.util.Scanner;

public class PrintF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "Spongebob";
        char letter = 's';
        int age = 15;
        double height = 1.78;
        boolean employed = true;
        // PRINTF is similar to .FORMAT in python

        System.out.printf("Hello %s \n", name);
        System.out.printf("Your name start with %c \n", letter);
        System.out.printf("You are %d years old \n", age);
        System.out.printf("You are %f inches tall \n", height);
        System.out.printf("Employed: %b \n", employed);
        System.out.printf("%s are %d years old ", name, age);

        // precision numbers after point
        double number1 = 12.4887;
        double number2 = 7447.45;
        double number3 = -9.99;

        // format numbers and values
        // + output a positive or negative number
        // , comma grouping separator; in english: (100,514.25); in portuguese: (1.485,15)
        // ( negative numbers are enclosed (15)
        // space display a minus if negative, space if positive
        System.out.printf("%+.2f \n", number1);
        System.out.printf("%,.1f \n", number2);
        System.out.printf("% .3f \n", number3);

        // number = right justified padding
        // negative number = left justified padding
        int id1 = 1;
        int id2 = 51;
        int id3 = 485;
        int id4 = 7851;
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
        input.close();
    }
}
