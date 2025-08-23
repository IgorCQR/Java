import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: "); String nome = input.nextLine();
        System.out.print("Digite sua idade: "); int idade = input.nextInt();
        System.out.print("Informe sua altura: "); double altura = input.nextDouble();

        System.out.print("Você é um(a) estudante? (true/false): "); boolean estudante = input.nextBoolean();

        System.out.println("Seu nome é " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Você mede " + altura + " metros");

        if(estudante){
            System.out.println("Você é um estudante");
        }else{
            System.out.println("Você não é um estudante");
        }

        input.close();
    }
}
