import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class VendaDeProdutos {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Continue = "";
        int item = 0;
        int Quantity = 0;
        int TotalValor = 0;
        int totalItens = 0;

        System.out.println("[1] Lixa fina - Valor Unit: R$4,00");
        System.out.println("[2] Martelo - Valor Unit: R$21,00");
        System.out.println("[3] Cimento - Valor Unit: R$45,00");
        System.out.println("[4] Capa de chuva - Valor Unit: R$30,00");
        System.out.println("[5] Botina - Valor Unit: R$60,00");
        do{
            System.out.print("Qual produto deseja comprar? "); item = input.nextInt();
            System.out.print("Quanto desja comprar? "); Quantity = input.nextInt();
            switch (item){
                case 1:
                    TotalValor += Quantity * 4;
                    totalItens += Quantity;
                    break;
                case 2:
                    TotalValor += Quantity * 21;
                    totalItens += Quantity;
                    break;
                case 3:
                    TotalValor += Quantity * 45;
                    totalItens += Quantity;
                    break;
                case 4:
                    TotalValor += Quantity * 30;
                    totalItens += Quantity;
                    break;
                case 5:
                    TotalValor += Quantity * 60;
                    totalItens += Quantity;
                    break;
            }
            System.out.print("Deseja realizar outra compra? [s/n] "); Continue = input.next();
        }while(Continue.equalsIgnoreCase("s"));

        System.out.println("Total da compra: R$" + TotalValor);
        System.out.println("Total de itens comprados: " + totalItens);
        input.close();
    }
}
