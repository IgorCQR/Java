import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter the temperature: ");
        double temp = input.nextDouble();

        System.out.println("What unit do you to convert? C or F?");
        String conv = input.next().toUpperCase();

        double newTemp = (conv.equals("C")) ? (temp - 32) * 1.8 : (temp * 1.8) + 32;

        System.out.printf("%.1f°%s", newTemp, conv);
        input.close();
    }
}
