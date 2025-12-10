import java.util.Scanner;

public class SubStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // .substring(): A method used to extract a portion of a String (.substring[start, end])

        System.out.print("Enter your email: ");
        String email = input.next();
        String username = email.substring(0,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);
        input.close();
    }
}
