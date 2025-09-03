import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("SALDO BANCÁRIO");

        System.out.print("Número da conta bancária: "); int conta = input.nextInt();
        System.out.print("Informe o saldo da sua conta: "); float saldo = input.nextFloat();
        System.out.print("Informe os recentes débitos da conta: "); float debito = input.nextFloat();
        System.out.print("Informe o valor creditado na conta: "); float credito = input.nextFloat();

        float saldoAtual = saldo - debito + credito;
        if(saldoAtual >= 0){
            System.out.println("Sua conta possui R$" + saldoAtual + ". O saldo está positivo");
        }else {
            System.out.println("Sua conta possui R$" + saldoAtual + ". O saldo está negativo");
        }
        input.close();
    }
}
